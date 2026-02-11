import java.util.Scanner;
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }
    void add(float a, float b) {
        System.out.println("Sum of floats: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        Calculator c = new Calculator();
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        c.add(x, y);
        System.out.print("Enter two float values: ");
        float p = sc.nextFloat();
        float q = sc.nextFloat();
        c.add(p, q);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        c.add(a, b, d);
    }
}
