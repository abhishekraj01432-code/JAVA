class Palindrome {
    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);
        int temp = n, rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        if (temp == rev)
            System.out.println(temp + " is a Palindrome Number");
        else
            System.out.println(temp + " is Not a Palindrome Number");
    }
}
