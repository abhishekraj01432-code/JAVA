import java.util.Scanner;
public class Matrix {
    static void inputMatrix(int[][] m, int r, int c, Scanner sc) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
    }
    static void showMatrix(int[][] m, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void AddMatrix(int[][] a, int[][] b, int r, int c) {
        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of matrices:");
        showMatrix(sum, r, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        System.out.println("Enter elements of first matrix:");
        inputMatrix(m1, r, c, sc);
        System.out.println("Enter elements of second matrix:");
        inputMatrix(m2, r, c, sc);
        System.out.println("First Matrix:");
        showMatrix(m1, r, c);
        System.out.println("Second Matrix:");
        showMatrix(m2, r, c);
        AddMatrix(m1, m2, r, c);
    }
}
