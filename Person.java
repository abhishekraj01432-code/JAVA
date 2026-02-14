import java.util.Scanner;
class Person {
    String name;
    int age;
    void getPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }
    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }}
class Student extends Person {
    String rollNo;
    void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNo = sc.nextLine();
    }
    void showStudent() {
        showPerson();  
        System.out.println("Roll No: " + rollNo);
    }
    public static void main(String args[]) {
        Student s = new Student();
        s.getPerson();
        s.getStudent();
        s.showStudent();
    }}
