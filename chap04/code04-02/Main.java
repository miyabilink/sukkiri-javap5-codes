public class Main {
  void main() throws Exception {
    IO.println("計算を開始します");
    /* : */ /* 何らかの計算処理 */
    IO.println("計算完了。結果をメモ帳で表示します");
    ProcessBuilder pb = new ProcessBuilder("c:¥¥windows¥¥system32¥¥notepad.exe", "calcreport.txt");
    pb.start();
  }
}