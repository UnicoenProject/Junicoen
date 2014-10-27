class Dsl
  Node = Struct.new(:name, :parents, :opt, :members) do

  end

  class NodeDsl
    def initialize(node, dsl)
      @node = node
      @dsl = dsl
    end

    def mem(name, type, **opt)
      type = @dsl.prefix + type if String === type
      @node.members << [name, type, opt]
    end
  end

  attr_reader :nodes
  attr_accessor :package, :prefix

  def initialize
    @nodes = []
    @parents = []
  end

  #
  # name: class name
  # parent: superclass name:
  #  if parent is nil, no parent.
  #  if no parent given, define parent from context.
  def node(name, parent = [], **opt, &block)
    inherits = parent.nil? ? [] : Array(parent) + @parents
    node = Node.new(prefix + name, inherits, opt, [])
    @parents.unshift(node)
    NodeDsl.new(node, self).instance_eval(&block)
    @parents.shift
    @nodes << node
  end

  def show
    @nodes.each do |node|
      parents = node.parents.map(&:name).join(", ")
      puts "public class %s < %s {" % [node.name, parents]
      node.members.each do |name, type|
        puts "\tpublic %s %s;" % [type, name]
      end
      puts "}"
    end
  end
end

def define_node(&block)
  x = Dsl.new
  x.instance_eval(&block)
  x
end
