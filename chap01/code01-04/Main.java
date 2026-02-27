import java.util.Arrays;

public class Main {
  void main() {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {1, 2, 3, 4, 5};
    IO.println("誤った判定：" + a.equals(b));
    IO.println("正しい判定：" + Arrays.equals(a, b));
  }
}