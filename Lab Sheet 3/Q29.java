import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        int[][] a = {{5, 2, 8}, {9, 3}, {7, 1, 4, 6}};

        for (int[] row : a) Arrays.sort(row);

        System.out.println("Sorted jagged array:");
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
