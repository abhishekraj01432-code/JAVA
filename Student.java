import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        try {
            int marks, roll;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter roll number: ");
            roll = scan.nextInt();
            if (roll < 0)
                throw new Exception("Roll number should be larger than zero");
            System.out.print("Enter percentage of marks: ");
            marks = scan.nextInt();
            if (marks > 100 || marks < 0)
                throw new Exception("percentage should be between 1-100");

            System.out.println("Roll :" + roll);
            System.out.println("Percentage of Marks: " + marks);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}