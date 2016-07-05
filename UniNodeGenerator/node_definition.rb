require_relative 'lib/dsl.rb'
require_relative 'lib/writer.rb'

Dsl.define_node do |x|
  x.package = "net.unicoen.node"
  x.prefix = "Uni"

  x.node "Node", abstract: true do |n|
    n.mem 'comments', String, list: true

    x.node "Expr", abstract: true, member: { statement: :boolean } do
      #
      # Factor
      #
      {
        "Bool" => :boolean,
        "Int" => :int,
        "Long" => :long,
        "Double" => :double,
        "String" => String
      }.each do |name, type|
        x.node "#{name}Literal" do |d|
          d.mem "value", type
        end
      end
      x.node "Ident" do |d|
        d.mem "name", String
      end
      #
      # Expressions
      #
      x.node "Array" do |d|
        d.mem "items", "Expr", list: true
      end
      x.node "FieldAccess" do |d|
        d.mem "receiver", "Expr"
        d.mem "fieldName", String
      end
      x.node "MethodCall", doc: '関数/メソッド呼び出し' do |d|
        d.mem "receiver", "Expr"
        d.mem "methodName", String
        d.mem "args", "Expr", list: true
      end
      x.node "New" do |d|
        d.mem "type", String
        d.mem "args", "Expr", list: true
      end
      x.node "NewArray" do |d|
        d.mem "type", String
        d.mem "elementsNum", "Expr", list: true
        d.mem "value", "Array"
      end
      x.node "UnaryOp", doc: '単項式' do |d|
        d.mem "operator", String
        d.mem "expr", "Expr"
      end
      x.node "BinOp", doc: '二項式' do |d|
        d.mem "operator", String
        d.mem "left", "Expr"
        d.mem "right", "Expr"
      end
      x.node "TernaryOp", doc: '条件式/条件演算子' do |d|
        d.mem "cond", "Expr"
        d.mem "trueExpr", "Expr"
        d.mem "falseExpr", "Expr"
      end
      x.node "Cast" do |d|
        d.mem "type", String
        d.mem "value", "Expr"
      end
      #
      # Control flow
      #
      x.node "Return", block: true do |d|
        d.mem "value", "Expr"
      end
      x.node "Break"
      x.node "Continue"
      #
      # Block
      #
      x.node "Block", statement: true do |d|
        d.mem "body", "Expr", list: true
        d.mem "blockLabel", String
      end
      x.node "If", statement: true do |d|
        d.mem "cond", "Expr"
        d.mem "trueStatement",  "Expr"
        d.mem "falseStatement", "Expr"
      end
      x.node "For", statement: true do |d|
        d.mem "init", "Expr"
        d.mem "cond", "Expr"
        d.mem "step", "Expr"
        d.mem "statement", "Expr"
      end
      x.node "EnhancedFor", statement: true do |d|
      	d.mem "modifiers", String, list:true
      	d.mem "type", String
      	d.mem "name", String
      	d.mem "container", "Expr"
      	d.mem "statement", "Expr"
      end
      x.node "While", statement: true do |d|
        d.mem "cond", "Expr"
        d.mem "statement", "Expr"
      end
      x.node "DoWhile", statement: true do |d|
        d.mem "statement", "Expr"
        d.mem "cond", "Expr"
      end
      x._node "Try", statement: true do |d|
        d.mem "tryExpr", "Block"
        d.mem "tryBlock", "Block"
        d.mem "catchBlock", "Block"
        d.mem "finallyBlock", "Block"
      end
      x.node "Switch" do |d|
          d.mem "cond", "Expr"
          d.mem "cases", "SwitchUnit", list:true
      end
      x.node "SwitchUnit" do |d|
          d.mem "label", String
          d.mem "cond", "Expr"
          d.mem "statement", "Expr", list: true
      end
      x.node "VariableDec", doc: '変数宣言＋代入' do |d|
        d.mem "modifiers", String, list: true
        d.mem "type", String
        d.mem "name", String
        d.mem "value", "Expr"
      end
      
      x.node "EmptyStatement"
    end

    x.node "MemberDec", abstract: true do
      x.node "FieldDec" do |d|
        d.mem "modifiers", String, list: true
        d.mem "type", String
        d.mem "name", String
        d.mem "value", "Expr"
      end
      x.node "MethodDec" do |d|
        d.mem "methodName", String
        d.mem "modifiers", String, list: true
        d.mem "returnType", String
        d.mem "args", "Arg", list: true
        d.mem "block", "Block"
      end
      x.node "Arg" do |d|
        d.mem "type", String
        d.mem "name", String
      end
    end
    x.node "ClassDec" do |d|
      d.mem "className", String
      d.mem "modifiers", String, list: true
      d.mem "members", "MemberDec", list: true
      d.mem "superClass", String, list: true
      d.mem "interfaces", String, list: true
      d.mem "innerClasses", "ClassDec", list: true
    end
    x.node "InterfaceDec" do |d|
        d.mem "interfaceName", String
        d.mem "modifiers", String, list: true
        d.mem "members", "MemberDec", list: true
        d.mem "superInterface", String, list: true
    end
   
    x.node "Program" do |d|
      d.mem "classes", "ClassDec", list: true
      d.mem "imports", "Import", list: true
      d.mem "namespace", "Namespace"
      d.mem "interfaces", "InterfaceDec", list: true
    end
    x.node "Import" do |d|
      d.mem "targetName", String
      d.mem "isStatic", :boolean
    end
    x.node "Namespace" do |d|
      d.mem "name", String
    end
  end
end
