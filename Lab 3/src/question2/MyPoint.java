package question2;

public class MyPoint {
  private int x;
  private int y;
  
  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
   
  public double getDistance(MyPoint p) {
    return Math.sqrt(Math.pow((x - p.x), 2) + (Math.pow((y - p.y), 2)));
  }
}