import java.util.Scanner;
 void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any day: ");
        String day = sc.nextLine();

        switch(day.toLowerCase()) {

            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It is a Weekday");
                break;

            case "saturday":
            case "sunday":
                System.out.println("It is a Weekend");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
