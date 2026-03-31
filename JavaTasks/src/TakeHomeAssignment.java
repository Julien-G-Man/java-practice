import java.util.Arrays;
import java.util.Scanner;

public class TakeHomeAssignment {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double standardDeviation(double[] data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }

        double mean = sum / data.length;

        double sumSquaredDiffs = 0;
        for (double num : data) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }

        return Math.sqrt(sumSquaredDiffs / data.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] evenNumbers = new int[10];
        int index = 0;
        int sum = 0;

        System.out.println("Enter 20 integers from 1 to 20:");

        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                if (index < evenNumbers.length) {
                    evenNumbers[index] = num;
                    index++;
                    sum += num;
                }
            }
        }

        if (index != 10) {
            System.out.println("Error: You did not enter exactly 10 even numbers.");
            return;
        }

        double average = (double) sum / evenNumbers.length;

        if (average != Math.floor(average)) {
            System.out.println("Average is not a whole number, factorial cannot be computed directly.");
            return;
        }

        int avgInt = (int) average;
        long factorialResult = factorial(avgInt);
        double squareRootResult = Math.sqrt(factorialResult);

        // Standard deviation of factorial result and square root result
        double[] results = {factorialResult, squareRootResult};
        double stdDev = standardDeviation(results);

        System.out.println("Even integers: " + Arrays.toString(evenNumbers));
        System.out.println("Average: " + average);
        System.out.println("Factorial of average: " + factorialResult);
        System.out.println("Square root of factorial: " + squareRootResult);
        System.out.println("Standard deviation of factorial and square root results: " + stdDev);

        scanner.close();
    }
}