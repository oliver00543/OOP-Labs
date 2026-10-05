import java.util.Scanner;

public class PSUStudentTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        try {
            new UndergradStudent2(age, gpa);
            new GradStudent2(age, gpa);
            System.out.println("Students successfully created!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
