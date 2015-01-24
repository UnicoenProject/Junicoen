require 'set'
require 'fileutils'

module Writer

  TRAVERSER_NAME = ['Traverser', 'traverse']

  module StringExt
    def camelize
      gsub(/_(.)/){ $1.capitalize }
    end
    def pascalize
      camelize.capitalize
    end
  end
  String.include StringExt

  class IndentWriter
    def initialize(file)
      @file = file
      @indent = 0
    end

    def newline
      @file.puts
    end

    def block(strs, &block)
      indent
      Array(strs).each{ |str| @file.print str }
      @file.puts " {"
      with_indent(&block)
    ensure
      indent
      @file.puts "}"
    end

    def with_indent
      @indent += 1
      yield if block_given?
    ensure
      @indent -= 1
    end

    def <<(val)
      indent
      @file.puts val
    end

    def indent
      @indent.times { @file.print "\t" }
    end
  end

  extend ::FileUtils
  module_function

  def write(dsl, dir)
    pkg_dir = dir + "/" + dsl.package.split(".").join("/")
    rm_rf pkg_dir
    mkdir_p pkg_dir
    dsl.nodes.each do |node|
      File.open(pkg_dir + "/" + node.name + ".java", "w") do |f|
        w = IndentWriter.new(f)

        # -- package
        w << "package #{dsl.package};"

        # -- import
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
        if has_list
          w.newline
          w << "import java.util.List;"
        end

        # -- class declaration
        w.newline
        write_class_dec(dsl, node, w)
      end
    end
    File.open(pkg_dir + "/#{TRAVERSER_NAME[0]}.java", "w") do |f|
      write_traverser(dsl, IndentWriter.new(f))
    end
  end

  def write_class_dec(dsl, node, w)
    # -- write document comment
    if doc = node.opt[:doc]
      w << "/** #{doc} */"
    end
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
    # dec class
    w.block "public #{type} #{node.name}#{inherit}" do
      # -- member
      write_member(dsl, node, w)
      if is_concrete
        w.newline
        write_ctor(dsl, node, w)
        w.newline
        write_to_string(dsl, node, w)
        w.newline
        write_equals(dsl, node, w)
        write_conc_additional_member(dsl, node, w)
      else
        write_abst_additional_member(dsl, node, w)
      end
    end
  end

  #
  # メンバ変数を生成する
  #
  def write_member(dsl, node, w)
    node.members.each do |name, type, opt|
      t = opt[:list] ? "List<#{type}>" : type
      w << "public #{t} #{name};"
    end
  end

  #
  # コンストラクタを生成します
  #
  def write_ctor(dsl, node, w)
    w.block "public #{node.name}()"

    # -- ctor with values
    if node.members.size > 0
      w.newline
      args = node.members.map do |name, type, opt|
        t = opt[:list] ? "List<#{type}>" : type
        "#{t} #{name}"
      end.join(", ")
      w.block "public #{node.name}(#{args})" do
        node.members.map do |name, type, opt|
          w << "this.#{name} = #{name};"
        end
      end
    end
  end

  #
  # toString を生成します
  #
  def write_to_string(dsl, node, w)
    names = node.members
      .reject{ |name, type, opt| String === type || opt[:list] }
      .map{ |name, type, opt| name }
      .join(' + ", " + ')
    c_name = node.name.sub(dsl.prefix, "")

    w << "@Override"
    w.block "public String toString()" do
      if names.size > 0
        w << %[return "#{c_name}(" + #{names} + ")";]
      else
        w << %[return "#{c_name}";]
      end
    end
  end

  #
  # equals を生成します
  #
  def write_equals(dsl, node, w)
    w << "@Override"
    w.block "public boolean equals(Object obj)" do
      if node.members.size == 0
        w << "return obj != null && obj instanceof #{node.name};"
        break
      end
      w << "if (obj == null || !(obj instanceof #{node.name})) return false;"
      w << "#{node.name} that = (#{node.name})obj;"
      exprs = node.members.map do |name, type, opt|
        if /^[a-z]+/ =~ type.to_s
          "this.#{name} == that.#{name}"
        else
          "(this.#{name} == null ? that.#{name} == null : this.#{name}.equals(that.#{name}))"
        end
      end
      if exprs.size == 1
        w << "return " + exprs.first + ";"
        break
      end
      exprs.each_with_index do |expr, ix|
        case
        when ix == 0
          w << "return #{expr}"
        when ix == exprs.length - 1
          w << "\t&& #{expr};"
        else
          w << "\t&& #{expr}"
        end
      end
    end
  end

  def write_abst_additional_member(dsl, node, w)
    node.opt.fetch(:member, {}).each do |name, type|
      m_name = (/bool/i =~ type ? 'is' : 'get') + name.to_s.pascalize
      if node.opt[:interface]
        w << "public #{type} #{m_name}();"
      else
        w << "public abstract #{type} #{m_name}();"
      end
    end
  end

  def write_conc_additional_member(dsl, node, w)
    node.parents.each do |parent|
      parent.opt.fetch(:member, {}).each do |name, type|
        m_name = (/bool/i =~ type ? 'is' : 'get') + name.to_s.pascalize
        value = node.opt.fetch(name, default_value(type))

        w.newline
        w << "@Override" if parent.opt[:abstract]
        w.block "public #{type} #{m_name}()" do
          w << "return #{value};"
        end
      end
    end
  end

  def write_traverser(dsl, w)
    no_prefix = ->(node){ node.name.sub(dsl.prefix, '') }
    call_method = ->(node){ TRAVERSER_NAME[1] + no_prefix[node] }
    w << "package #{dsl.package};"
    w.newline
    w.block "public abstract class #{TRAVERSER_NAME[0]}" do
      abst = []
      conc = []
      dsl.nodes.each do |node|
        case
        when node.opt[:interface]
          # do nothing
        when node.opt[:abstract]
          abst << node
        else
          conc << node
        end
      end
      # -- abst class
      conc.sort_by(&:name)
      w.newline
      conc.each do |node|
        w << "public abstract void #{call_method[node]}(#{node.name} node);"
      end
      abst.each do |node|
        w.newline
        w.block "public final void #{call_method[node]}(#{node.name} node)" do
          dsl.nodes.each do |child|
            next if child.parents.first != node
            w.block "if (node instanceof #{child.name})" do
              w << "#{call_method[child]}((#{child.name})node);"
              w << "return;"
            end
          end
          w << %{throw new RuntimeException("Unknown node: " + node);}
        end
      end
    end
  end

  def default_value(type)
    case type
    when /bool/
      'false'
    end
  end
end
