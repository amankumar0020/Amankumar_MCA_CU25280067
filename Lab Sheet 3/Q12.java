import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3], b = new int[3][3], c = new int[3][3];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) b[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) c[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum matrix:");
        for (int[] row : c) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
        sc.close();
    }
}
