public class Main {
  void main() {
    Pocket<String> p = new Pocket<>();
    p.put("1192");
    String s = p.get();
    IO.println(s);
  }
}