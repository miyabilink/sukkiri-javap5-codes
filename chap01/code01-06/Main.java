public class Main {
  void main() {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;

    IO.println(h1.hashCode());
  }
}