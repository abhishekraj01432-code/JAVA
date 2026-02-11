import java.util.Scanner;
class Bank {
    private double balance;
    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount Deposited");
    }
    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Bank acc = new Bank();
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        int choice;
        do {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display Balance\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    acc.showBalance();
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
    }
}
