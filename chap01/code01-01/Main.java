public class Main {
  void main() {
    Hero h1 = new Hero();
    h1.setName("ミナト");
    h1.setHp(100);
    h1.setMp(50);

    IO.println(h1.toString());
  }
}