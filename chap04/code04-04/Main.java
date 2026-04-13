public class Main {
  void main() {
    String ver = System.getProperty("rpg.version");
    String author = System.getProperty("rpg.author");
    IO.println("RPG: スッキリ魔王征伐 ver" + ver);
    IO.println("Developed by " + author);
  }
}