require_relative 'dsl.rb'
require_relative 'writer.rb'

d = define_node do |x|
  x.package = "net.unicoen.nodes"
  x.prefix = "Uni"

  x.node "Node", interface: true, generics: :self do

    x.node "Expr", abstract: true, generics: :self do
      {
        "Bool" => :bool,
        "Int" => :int,
        "String" => String
      }.each do |name, type|
        x.node "#{name}Literal" do |d|
          d.mem "value", type
        end
      end
      x.node "Ident" do |d|
        d.mem "name", String
      end
      x.node "MethodCall" do |d|
        d.mem "receiver", "Expr"
        d.mem "methodName", String
        d.mem "args", "Expr", list: true
      end
      x.node "BinOp" do |d|
        d.mem "operator", String
        d.mem "left", "Expr"
        d.mem "right", "Expr"
      end
      x.node "If" do |d|
        d.mem "cond", "Expr"
        d.mem "trueBlock",  "Expr", list: true
        d.mem "falseBlock", "Expr", list: true
      end
      x.node "While" do |d|
        d.mem "cond", "Expr"
        d.mem "body", "Expr", list: true
      end
    end
  
    x.node "MemberDec", abstract: true, generics: :self do
      x.node "FuncDec" do |d|
        d.mem "funcName", String
        d.mem "modifiers", String, list: true
        d.mem "returnType", String
        d.mem "args", "Arg", list: true
        d.mem "body", "Expr", list: true
      end
      x.node "Arg", nil do |d|
        d.mem "type", String
        d.mem "name", String
      end
    end
    x.node "ClassDec" do |d|
      d.mem "modifiers", String, list: true
      d.mem "members", "MemberDec", list: true
    end
  end
end

# d.show

outdir = ENV.fetch('OUTDIR', File.dirname(__FILE__) + "/out")
Writer.write(d, outdir)
