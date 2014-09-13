public class Main {
  public static void main(String[] args) {
    MyLib.printInt(1);
  }
}
/*
(ClassDec
  [:name "Main"]
  [:modifiers "public"]
  [:member
    (FuncDec
      [:name "main"]
      [:modifiers "public" "static"]
      [:return "void"]
      [:args
        (Arg
          [:type "String[]"]
          [:name "args"])]
      [:body
        (MethodCall
          [:receiver (Ident "MyLib")]
          [:name "printInt"]
          [:args (Lit 1)])])
  ])
*/
