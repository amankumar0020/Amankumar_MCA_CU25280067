import java.util.Scanner;

class NumberAnalyzer {
    private double[] numbers;

    NumberAnalyzer(double[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double number : numbers) sum += number;
        return sum / numbers.length;
    }

    public int countAboveAverage() {
        double average = calculateAverage();
        int count = 0;
        for (double number : numbers) {
            if (number > average) count++;
        }
        return count;
    }
}

public class AverageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        System.out.println("Average: " + analyzer.calculateAverage());
        System.out.println("Numbers above average: " + analyzer.countAboveAverage());
        scanner.close();
    }
}
