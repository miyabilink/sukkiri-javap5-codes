import java.util.*;

public class Main {
  void main() {
    TimeZone tz = TimeZone.getDefault();
    IO.print("現在のタイムゾーン：");
    IO.println(tz.getDisplayName());
    if (tz.useDaylightTime()) {
      IO.println("夏時間を採用しています");
    } else {
      IO.println("夏時間を採用していません");
    }
    IO.print("世界標準時との時差は");
    IO.println(tz.getRawOffset() / 3600000 + "時間");
  }
}