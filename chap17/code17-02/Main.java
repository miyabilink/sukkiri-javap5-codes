import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
  void main() {
    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    frame.setLayout(new FlowLayout());
    JLabel label = new JLabel("Hello World!!");  // ラベルを生成して、
    frame.add(label);                            // フレームに追加
    JButton button = new JButton("押してね");     // ボタンを生成して、
    frame.add(button);                           // フレームに追加

    frame.setVisible(true);
    IO.println("フレームを表示");
  }
}