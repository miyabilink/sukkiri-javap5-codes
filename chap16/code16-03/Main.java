import java.util.*;

public class Main {
  void main() {
    IO.println("止めるには「STOP」を入力してください");
    IO.println("カウントダウンを開始します");
    PrintingThread t = new PrintingThread();
    t.start();
    String input = IO.readln();
    if (input.equals("STOP")) {
      t.stopReq.set(true);
    }
    try {
      t.join();
    } catch (InterruptedException e) { ; }
  }
}