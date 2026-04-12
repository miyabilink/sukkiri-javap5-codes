import java.util.function.*;

public class Main {
  void main() {
    Function<String, Integer> func = (String s) -> { return s.length(); };
    int n = func.apply("Java");
    IO.println("文字列「Java」は" + n + "文字です");
  }
}