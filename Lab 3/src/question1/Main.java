package question1;

import java.util.Scanner;

enum Shape {
  LINE, OVAL, RECTANGLE
}

public class Main {
  public static void main(String[] args) {
    int count = 0;
    System.out.println("Select 5 shape: ");
    System.out.print("Shape " + (count + 1) + ": ");
    Scanner input = new Scanner(System.in);
    while (count < 5) {
      String shapeIn = input.nextLine();
      Shape shape = Shape.valueOf(shapeIn);
      switch (shape) {
        case LINE:
          System.out.print("Lenght of LINE is: ");
          int length = input.nextInt();
          input.nextLine();
          MyLine line = new MyLine(length);
          line.draw();
          count++;
          break;
        case OVAL:
          System.out.print("Width of OVAL is: ");
          int width = input.nextInt();
          input.nextLine();
          System.out.print("Height of OVAL is: ");
          int height = input.nextInt(); 
          input.nextLine();
          MyOval oval = new MyOval(width, height);
          oval.draw();
          System.out.println("This oval has area: " + oval.GetArea());
          count++;
          break;
        case RECTANGLE:
          System.out.print("Width of RECTANGLE is: ");
          int w = input.nextInt();
          input.nextLine();
          System.out.print("Height of RECTANGLE is: ");
          int h = input.nextInt(); 
          input.nextLine();
          MyRectangle rect = new MyRectangle(w, h);
          rect.draw();
          System.out.println("This rectangle has area: " + rect.GetArea());
          count++;
          break;
        default:
          System.out.println("Error input");
          break;
      }
    }
  }
}
