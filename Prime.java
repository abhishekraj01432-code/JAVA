class Prime {
    public static void main(String args[]) {
    
        int n = Integer.parseInt(args[0]);
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
           System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        if (count == 2)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is Not a Prime Number");
    }
}
