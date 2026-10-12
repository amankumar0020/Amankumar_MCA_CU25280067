import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) a[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean hasSecond = false;

        for (int x : a) {
            if (x > largest) {
                if (largest != Integer.MIN_VALUE || x > Integer.MIN_VALUE)
                    hasSecond = (largest != Integer.MIN_VALUE);
                second = largest;
                largest = x;
            } else if (x < largest && (!hasSecond || x > second)) {
                second = x;
                hasSecond = true;
            }
        }

        if (!hasSecond)
            System.out.println("No second largest distinct element");
        else
            System.out.println("Second largest = " + second);
        sc.close();
    }
}
