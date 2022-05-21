package question2;

public class MyTriangle {
  private MyPoint v1;
  private MyPoint v2;
  private MyPoint v3;
  private double d1;
  private double d2;
  private double d3;


  public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    v1 = new MyPoint(x1, y1);
    v2 = new MyPoint(x2, y2);
    v3 = new MyPoint(x3, y3);
    d1 = v1.getDistance(v2);
    d2 = v1.getDistance(v3);
    d3 = v2.getDistance(v3);
  }

  public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
    d1 = v1.getDistance(v2);
    d2 = v1.getDistance(v3);
    d3 = v2.getDistance(v3);
  }

  public String toString() {
    return String.format("MyTriangle[v1=(%d, %d), v2=(%d, %d), v3=(%d, %d)]", v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
  }

  public double getPerimeter() {
    return d1 + d2 + d3;
  }

  public String getType() {
    if (d1 == d2 && d2 == d3)
      return "Equilateral";
    else if (d1 == d2 || d1 == d3 || d2 == d3) 
      return "Isosceles";
    else 
      return "Scalene";
  }
}