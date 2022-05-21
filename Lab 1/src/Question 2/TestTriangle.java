package Question2;

public class TestTriangle {
    public static void main(String[] args){
        Triangle a = new Triangle();
        System.out.println("Input Triangle: ");
        a.Input();
        String Result;
        Result = Triangle.verify(a.getLength1(), a.getLength2(), a.getLength3());
        System.out.println("Triangle Verification: " + Result);
    }
}
