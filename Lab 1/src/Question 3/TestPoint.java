package Question3;
import java.util.Scanner;

public class TestPoint {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Input xa");
        double xa = s.nextDouble();
        System.out.println("Input ya");
        double ya=s.nextDouble();
        System.out.println("Input yb");
        double xb=s.nextDouble();
        System.out.println("Input yb");
        double yb= s.nextDouble();

        Point p1= new Point(xa,ya);
        Point p2= new Point(xb,yb);
        System.out.printf("The distance between point A and B is %.5f",p1.distance(p2));
        s.close();
    }

}
