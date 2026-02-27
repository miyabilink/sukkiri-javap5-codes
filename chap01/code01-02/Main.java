public class Main {
  void main() {
    Account a1 = new Account();
    a1.accountNo = "001";

    // (1)自分自身が引数として渡された場合、無条件でtrueを返す。
    IO.println(a1.equals(a1));
    // (2)nullが引数として渡された場合、無条件でfalseを返す。
    IO.println(a1.equals(null));
    // (3)型が異なるならば、falseを返す。
    String s1 = "";
    IO.println(a1.equals(s1));
    // (4)型が同じなら、2つのインスタンスが持つフィールド同士を比較して等価か判定する
    Account a2 = new Account();
    a2.accountNo = "002";
    IO.println(a1.equals(a2));
    a2.accountNo = "  001";
    IO.println(a1.equals(a2));
  }
}