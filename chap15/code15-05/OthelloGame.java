public class OthelloGame {
  void main() {
    IO.println("オセロゲームを開始します");
    int[][] board = new int[8][8];

    OthelloAI ai = null;
    IO.println("コンピュータの強さを選んでください" + "(1=弱い, 2=強い, 3=その他)");
    int cpuno = Integer.parseInt(IO.readln());
    if (cpuno == 1) {
      ai = new WeakOthelloAI();
    } else if (cpuno == 2) {
      ai = new StrongOthelloAI();
    } else {
      /* ： */
    }

    while (true) {
      IO.println("あなたの番:打つ場所を決めてください");
      /* ： */
      IO.println("わたしの番：打つ場所を決めます");
      int[] nextStone = ai.decide(board);
      /* ： */
    }
  }
}