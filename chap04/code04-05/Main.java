import java.util.*;
import java.text.*;

public class Main {
  void main() {
    Locale loc = Locale.getDefault();
    IO.println(loc.getCountry() + "-" + loc.getLanguage());
    String now = (new SimpleDateFormat()).format(new Date());
    if (loc.getLanguage().equals("ja")) {
      IO.println("現在の時刻は" + now);
    } else {
      IO.println("Current time is " + now);
    }
  }
}