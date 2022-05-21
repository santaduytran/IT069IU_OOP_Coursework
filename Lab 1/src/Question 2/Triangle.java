package Question2;
import java.util.Scanner;

public class Triangle{
    private double length1;
    private double length2;
    private double length3;

    public double getLength1() {
        return length1;
    }
    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }
    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }
    public void setLength3(double length3) {
        this.length3 = length3;
    }

    public Triangle() {
        length1 = 1;
        length2 = 1;
        length3 = 1;
    }
    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The first Length: ");
        setLength1(sc.nextFloat());
        if (this.getLength1() < 0) {
            System.out.println("Error!!!");
            this.setLength1(1);
        }
        System.out.print("The second Length: ");
        setLength2(sc.nextFloat());
        if (this.getLength2() < 0) {
            System.out.println("Error!!!");
            this.setLength2(1);
        }
        System.out.print("The third Length: ");
        setLength3(sc.nextFloat());
        if (this.getLength3() < 0) {
            System.out.println("Error!!!");
            this.setLength3(1);
        }
    }
    public void Output() {
        System.out.println("The first length: " + length1);
        System.out.println("The second length: " + length2);
        System.out.println("The third length: " + length3);
    }
    public static String verify ( double length1, double length2, double length3) {
        String Result ="";
        if (length1 != 0 && length2 != 0 && length3 != 0) {
            if((length1 + length2 > length3) || (length1 + length3 > length2) || (length2 + length3 > length1)) {
                if((length1 == length2)&&(length2 == length3)&&(length3 == length1)) {
                    Result="Equilateral Triangle";
                }
                else if((length1 == length2) || (length2 == length3) || (length3 == length1)) {
                    Result = "Isosceles Triangle";
                }
                else if ((length1 != length2) || (length2 != length3) || (length3 != length1)) {
                    Result= "Scalene Triangle";
                }
            }
        }
        else
        {
            Result = "Not Triangle";
        }
        return Result;
    }
}
