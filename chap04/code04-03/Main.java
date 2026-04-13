import java.util.*;

public class Main {
  void main() {
    IO.print("利用中のJavaバージョン：");
    IO.println(System.getProperty("java.version"));

    Properties p = System.getProperties();
    Iterator<String> i = p.stringPropertyNames().iterator();
    IO.println("システムプロパティ一覧");
    while (i.hasNext()) {
      String key = i.next();
      IO.print(key + " = ");
      IO.println(System.getProperty(key));
    }
  }
}