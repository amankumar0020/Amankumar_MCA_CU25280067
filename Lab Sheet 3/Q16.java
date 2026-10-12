import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    int x = sc.nextInt();
                    if (x > 0) positive++;
                    else if (x < 0) negative++;
                    else zero++;
                }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
        sc.close();
    }
}
