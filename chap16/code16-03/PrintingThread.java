import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class PrintingThread extends Thread {
  // スレッド中断の要請を管理するフィールド
  final AtomicBoolean stopReq = new AtomicBoolean(false);

  public void run() {
    for (int i = 9; i >= 0; i--) {
      if (this.stopReq.get()) {
        break;
      }
      IO.print (i + "..");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) { ; }
    }
  }
}