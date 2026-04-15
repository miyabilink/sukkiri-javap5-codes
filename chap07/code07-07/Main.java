import java.util.*;

public class Main {
  void main() throws Exception {
    ResourceBundle rb = ResourceBundle.getBundle(
        "jp.miyabilink.rpg.rpgdata");
    String heroName = rb.getString("heroName");
    IO.println("勇者の名前:" + heroName);
  }
}