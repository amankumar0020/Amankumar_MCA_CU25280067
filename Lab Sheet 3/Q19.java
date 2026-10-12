public class Q19 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        System.out.println("Jagged Array:");
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
