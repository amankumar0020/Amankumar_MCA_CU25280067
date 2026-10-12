import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Please enter a three-digit number");
        } else {
            int original = n;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit * digit;
                n = n / 10;
            }

            if (sum == original)
                System.out.println("Armstrong number");
            else
                System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}
