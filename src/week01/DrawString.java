package week01;

import javax.swing.*; 
import java.awt.*; 

class MyPanel extends JPanel{
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); 
    g.setColor(Color.BLUE);
    g.setFont(new Font("���ü", Font.PLAIN, 30));
    g.drawString("�ȳ��ϼ��� ?", 30, 130);
    g.setColor(Color.RED);
    g.setFont(new Font("Ariel", Font.BOLD, 40));
    g.drawString("Hi! Everyone", 30, 200);
    g.setColor(Color.GREEN);
    g.setFont(new Font("���ü", Font.BOLD, 50));
    g.drawString("�ڹ� ���α׷��� �����մϴ�.", 30, 300);
  }
}

public class DrawString extends JFrame {
  public DrawString() {
    setTitle("DrawString Test");
    Container ct = getContentPane();
    ct.add(new MyPanel());
  }   

  public static void main(String[] args) {
    DrawString gc = new DrawString();
    gc.setSize(800,500); 
    gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gc.setVisible(true); 
}
}
