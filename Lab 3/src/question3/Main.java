package question3;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("Duy", "Bien Hoa", "IU", 2018, 25000000);
    Staff staff = new Staff("Phong", "IU", "IT", 100000000);
    System.out.println(student.toString());
    System.out.println(staff.toString());
  }
}
