package question2;

public class Main {
  public static void main(String[] args) {
    MyPoint p1 = new MyPoint(0, -9);
    MyPoint p2 = new MyPoint(-9, 0);
    MyPoint p3 = new MyPoint(9, 0);
    MyTriangle tri = new MyTriangle(p1, p2, p3);
    System.out.println(tri.toString());
    System.out.println(tri.getType());
    System.out.println(tri.getPerimeter());
  }
}
