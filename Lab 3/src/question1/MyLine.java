package question1;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyLine extends MyShape {
  private int length;

  public MyLine(int length) {
    if (length < 1) {
      System.out.print("Please input valid positive number");
      this.length = 1;
    } else {
      this.length = length;
    }
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void draw() {
    java.awt.Frame frame = new Frame();
    frame.add(new Line());
    frame.setSize(100, 100);
    frame.setVisible(true);
    //for (int i = 0; i < length; i++) {
      //System.out.print("-");
    //}
    //System.out.println();
  }

  class Line extends Component {
    public void paint(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      int x = 10;
      int y = 10;
      g2d.drawLine(x, y, x + length, y);
    } 
  }
}