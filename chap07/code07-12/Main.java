import java.io.*;

public class Main {
  void main() throws IOException {
    Hero h = new Hero("ミナト", 75, 18);
    h = h.loadHeroFromFile();
    IO.println("ファイルから読み取った情報は");
    IO.println(h.name);
    IO.println(h.hp);
    IO.println(h.mp);
  }
}