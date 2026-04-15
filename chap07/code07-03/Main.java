import java.util.*;

public class Main {
  void main() {
    String s = "ミナト,アサカ,スガワラ";
    String[] st = s.split(",");
    for (String t : st) {
      IO.println(t);
    }
  }
}