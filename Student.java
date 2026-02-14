import java.util.Scanner;
class Student {
    String rollNo;
    String name;
    int age;
    Student(String r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        System.out.print("Enter roll number: ");
        String r = sc.nextLine();  
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        Student s1 = new Student(r, n, a);
        s1.display();
    }
}
