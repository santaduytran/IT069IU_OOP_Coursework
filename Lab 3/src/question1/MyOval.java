package question1;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyOval extends MyBoundedShape {
  private int width;
  private int height;

  public MyOval(int width, int height) {
    if (width < 1 || height < 1) {
      System.out.println("Input valid positive number");
      this.width = 1;
      this.height = 1;
    } else {
      this.width = width;
      this.height = height;
    }
  }

  public void draw() {
    java.awt.Frame frame = new Frame();
    frame.add(new Oval());
    frame.setSize(300, 300);
    frame.setVisible(true);
    //System.out.println("This is a oval shape with width: " + width + " and height: " + height);
    //g.drawOval(0, 0, width, height);
  }

  public float GetArea() {
    return  ((float) width / 2 * height / 2);
  }

  class Oval extends Component {
    public void paint(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      int x = 10;
      int y = 10;
      g2d.drawOval(x, y, width, height);
    }
  }
}