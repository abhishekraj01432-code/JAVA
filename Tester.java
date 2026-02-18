import java.util.Scanner;
public class Tester {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int count = sc.nextInt();
            int[] num = {2, 4, 6, 8, 10};
            int sum = 0;

            for (int i = 0; i <= count; i++) {
                sum += num[i];
                System.out.println("sum is " + sum);
            }
            float avg = sum / count;
            System.out.println(avg);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}