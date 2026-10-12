import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5], b = new int[5];
        int n = 0;

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) a[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            boolean duplicate = false;
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) b[n++] = a[i];
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < n; i++) System.out.print(b[i] + " ");
        sc.close();
    }
}
