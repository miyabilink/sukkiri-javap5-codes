public class Main {
  void main(String[] args) {
    // Stringに関する情報を取得して表示する
    Class<?> info1 = String.class;
    IO.println(info1.getSimpleName());        // ⇒ String
    IO.println(info1.getName());              // ⇒ java.lang.String
    IO.println(info1.getPackage().getName());
                                                      // ⇒ java.lang
    IO.println(info1.isArray());              // ⇒ false
    // Stringの親クラスの情報を取得する
    Class<?> info2 = info1.getSuperclass();
    IO.println(info2.getName());              // ⇒ java.lang.Object
    // argsは文字列配列として判定される
    Class<?> info3 = args.getClass();
    IO.println(info3.isArray());              // ⇒ true
  }
}