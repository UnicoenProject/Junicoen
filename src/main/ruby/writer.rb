require 'set'
require 'fileutils'

module Writer
  extend ::FileUtils
  module_function

  def write(dsl, dir)
    pkg_dir = dir + "/" + dsl.package.split(".").join("/")
    rm_rf pkg_dir
    mkdir_p pkg_dir
    dsl.nodes.each do |node|
      File.open(pkg_dir + "/" + node.name + ".java", "w") do |f|
        # package
        f.puts "package #{dsl.package};"
        f.puts
        # import
        set = Set.new
        has_list = false
        node.members.each do |name, type, opt|
          if String === type
            set << type
          end
          if opt[:list]
            has_list = true
          end
        end
        # if set.size > 0
        #   set.each do |node_type|
        #     f.puts "import #{dsl.package}.#{node_type};"
        #   end
        #   f.puts
        # end
        if has_list
          f.puts "import java.util.List;"
          f.puts
        end
        # === class dec
        # -- open
        inherit = ""
        p = node.parents.first
        if p
          if p.opt[:interface]
            inherit = " implements #{p.name}"
          else
            inherit = " extends #{p.name}"
          end
        end
        is_concrete = true
        type = "class"
        case
        when node.opt[:interface]
          is_concrete = false
          type = "interface"
        when node.opt[:abstract]
          is_concrete = false
          type = "abstract class"
        end
        if doc = node.opt[:doc]
          f.puts "/** #{doc} */"
        end
        f.puts "public #{type} #{node.name}#{inherit} {"

        # -- member
        node.members.each do |name, type, opt|
          t = opt[:list] ? "List<#{type}>" : type
          f.puts "\tpublic #{t} #{name};"
        end

        if is_concrete
          # -- empty ctor
          f.puts
          f.puts "\tpublic #{node.name}() {"
          f.puts "\t}"

          # -- ctor with values
          if node.members.size > 0
            f.puts
            args = node.members.map do |name, type, opt|
              t = opt[:list] ? "List<#{type}>" : type
              "#{t} #{name}"
            end.join(", ")
            f.puts "\tpublic #{node.name}(#{args}) {"
            node.members.map do |name, type, opt|
              f.puts "\t\tthis.#{name} = #{name};"
            end
            f.puts "\t}"
          end

          # -- toString
          names = node.members
            .reject{ |name, type, opt| String === type || opt[:list] }
            .map{ |name, type, opt| name }
            .join(' + ", " + ')
          c_name = node.name.sub(dsl.prefix, "")
          f.puts
          f.puts "\t@Override"
          f.puts "\tpublic String toString() {"
          if names.size > 0
            f.puts %<\t\treturn "#{c_name}(" + #{names} + ")";>
          else
            f.puts %<\t\treturn "#{c_name}";>
          end
          f.puts "\t}"
        end

        # -- close
        f.puts "}"
      end
    end
  end
end
