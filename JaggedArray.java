import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is done by ABHISHEK VERMA, 2400320100055\n");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter size of row " + (i + 1) + ": ");
            arr[i] = new int[sc.nextInt()];
        }
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
