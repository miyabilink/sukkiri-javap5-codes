public class Main {
  void main() {
    Pocket p = new Pocket();
    p.put("1192");
    String s = (String)p.get();
    IO.println(s);
  }
}