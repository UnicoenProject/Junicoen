require_relative 'dsl.rb'
require_relative 'writer.rb'

Dsl.define_node do |x|
  x.package = "net.unicoen.node"
  x.prefix = "Uni"

  x.node "Node", interface: true, generics: :self do

    x.node "Expr", abstract: true, generics: :self do
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
      x.node "MethodCall", doc: '関数/メソッド呼び出し' do |d|
        d.mem "receiver", "Expr"
        d.mem "methodName", String
        d.mem "args", "Expr", list: true
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
      x.node "CondOp", doc: '条件式/条件演算子' do |d|
        d.mem "cond", "Expr"
        d.mem "trueExpr", "Expr"
        d.mem "falseExpr", "Expr"
      end
      #
      # Control flow
      #
      x.node "Return" do |d|
        d.mem "value", "Expr"
      end
      x.node "Break"
      x.node "Continue"
      #
      # Block
      #
      x.node "Block" do |d|
        d.mem "body", "Expr", list: true
      end
      x.node "If" do |d|
        d.mem "cond", "Expr"
        d.mem "trueBlock",  "Block"
        d.mem "falseBlock", "Block"
      end
      x.node "For" do |d|
        d.mem "init", "Expr"
        d.mem "cond", "Expr"
        d.mem "step", "Expr"
        d.mem "block", "Block"
      end
      x.node "While" do |d|
        d.mem "cond", "Expr"
        d.mem "block", "Block"
      end
      x.node "DoWhile" do |d|
        d.mem "block", "Block"
        d.mem "cond", "Expr"
      end
      x._node "Try" do |d|
        d.mem "tryExpr", "Block"
        d.mem "tryBlock", "Block"
        d.mem "catchBlock", "Block"
        d.mem "finallyBlock", "Block"
      end
      #
      # Var Dec
      #
      x.node "DecVar", doc: '変数宣言' do |d|
        d.mem "modifiers", String, list: true
        d.mem "type", String
        d.mem "name", String
      end
      x.node "DecVarWithValue", doc: '変数宣言＋代入' do |d|
        d.mem "modifiers", String, list: true
        d.mem "type", String
        d.mem "name", String
        d.mem "value", "Expr"
      end
    end

    x.node "MemberDec", abstract: true, generics: :self do
      x.node "FuncDec" do |d|
        d.mem "funcName", String
        d.mem "modifiers", String, list: true
        d.mem "returnType", String
        d.mem "args", "Arg", list: true
        d.mem "block", "Block"
      end
      x.node "Arg", nil do |d|
        d.mem "type", String
        d.mem "name", String
      end
    end
    x.node "ClassDec" do |d|
      d.mem "className", String
      d.mem "modifiers", String, list: true
      d.mem "members", "MemberDec", list: true
    end
  end
end
