package question1;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle {
  private int width, height;

  public MyRectangle(int width, int height) {
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
    frame.add(new Rectangle());
    frame.setSize(300, 300);
    frame.setVisible(true);
    //for (int i = 0; i < height; i++) {
      //for (int j = 0; j < width; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}
    //g.drawRect(0, 0, width, height);
  }

  public int GetArea() {
    return width * height;
  }

  class Rectangle extends Component {
    public void paint(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      int x = 10;
      int y = 10;
      g2d.drawRect(x, y, width, height);
    }
  }
}