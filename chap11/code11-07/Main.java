public class Main {
  void main() {
    int age = 33;           // 今年の年齢
    assert (++age >= 20);   // 来年20歳以上であるハズだ
    IO.println("あなたの来年の年齢は" + age);
  }
}