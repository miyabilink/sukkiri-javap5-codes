public class Main {
  void main() {
    Pocket<Object> pocket = new Pocket<>();
    IO.println("使い捨てのインスタンスを作りpocketに入れます");
    pocket.put(new Object() {
      String innerField;
    void innerMethod() { /* … */ }
    });
  }
}