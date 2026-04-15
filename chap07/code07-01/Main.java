import java.io.*;

public class Main {
  void main() throws IOException {
    Save s = new Save();
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 75;
    h.mp = 18;
    s.saveHeroToFile(h);
  }
}