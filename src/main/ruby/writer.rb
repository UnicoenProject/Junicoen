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
        if set.size > 0
          set.each do |node_type|
            f.puts "import #{dsl.package}.#{node_type};"
          end
          f.puts
        end
        if has_list
          f.puts "java.utils.List;"
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
        f.puts "public class #{node.name}#{inherit} {"

        # -- member
        node.members.each do |name, type, opt|
          t = opt[:list] ? "List<#{type}>" : type
          f.puts "\tpublic #{t} #{name};"
        end

        # -- close
        f.puts "}"
      end
    end
  end

  def write_clone(node)
    
  end
end
