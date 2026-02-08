import java.util.Scanner;

public class switchh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,a,b,c ;

        do { 
        System.out.println("Enter a number between 1 and 5:");
        choice = sc.nextInt();
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You selected 1");
                    c=a+b;
                    System.out.println("Sum is: "+c);
                    break;
                case 2:
                    System.out.println("You selected 2");
                    c=a-b;
                    System.out.println("Difference is: "+c);
                    break;
                case 3:
                    System.out.println("You selected 3");
                    c=a*b;
                    System.out.println("Product is: "+c);
                    break;
                case 4:
                    System.out.println("You selected 4");
                    if(b!=0){
                        c=a/b;
                        System.out.println("Quotient is: "+c);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice !=5);
    }
}