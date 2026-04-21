import java.util.*;
import java.util.concurrent.*;

public class Main {
  void main() {
    IO.println("止めるには「STOP」を入力してください");
    IO.println("カウントダウンを開始します");
    for (int i = 9; i >= 0; i--) {
      IO.print(i + "..");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {;}
    }
    String input = IO.readln();
    IO.println("入力文字列：" + input);
  }
}