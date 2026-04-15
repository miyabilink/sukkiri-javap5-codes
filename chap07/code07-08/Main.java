import java.util.*;
import java.text.*;
import java.io.*;

public class Main {
  void main() throws Exception {
    Locale loc = Locale.getDefault();
    IO.println(loc.getCountry() + "-" + loc.getLanguage());
    String now = (new SimpleDateFormat()).format(new Date());
    ResourceBundle rb = ResourceBundle.getBundle("messages");
    IO.println(rb.getString("CURRENT_TIME_IS") + now);
  }
}