package week01;
import javax.swing.*; 
import java.awt.*; 
class DrawCircle1 extends JPanel{
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); 
    Dimension d = getSize();
    int rval, gval, bval;
    for (int j = 30; j < (d.height -25); j += 30) 
      for (int i = 30; i < (d.width -25); i+= 30) {
	rval = (int)Math.floor(Math.random() * 256);
	gval = (int)Math.floor(Math.random() * 256);
	bval = (int)Math.floor(Math.random() * 256);
	
	g.setColor(new Color(rval,gval,bval));
	g.fillRect(i,j,25,25);
	g.setColor(Color.black);
	g.drawRect(i-1,j-1,25,25);
    }
  }
}
public class ColorBoxes extends JFrame{
  public ColorBoxes() {
    setTitle("DrawCircle Test1");
    Container ct = getContentPane();
    ct.add(new DrawCircle1());
  }   
  public static void main(String[] args) {
	ColorBoxes gc = new ColorBoxes();
    gc.setSize(500,500); 
    gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gc.setVisible(true); 
  }
}
