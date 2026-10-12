import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) a[i][j] = sc.nextInt();

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((i <= j ? a[i][j] : 0) + " ");
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((i >= j ? a[i][j] : 0) + " ");
            System.out.println();
        }
        sc.close();
    }
}
