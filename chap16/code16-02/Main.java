import java.util.*;

public class Main {
  void main() {
    IO.println("止めるには「STOP」を入力してください");
    IO.println("カウントダウンを開始します");
    Thread t = new PrintingThread();
    t.start();
    String input = IO.readln();
    IO.println("入力文字列：" + input);
    IO.println("停止処理は未作成です");
  }
}