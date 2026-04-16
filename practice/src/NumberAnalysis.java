import java.math.BigInteger;
import java.util.Arrays;

public class NumberAnalysis {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static double standardDeviation(int[] arr, double mean) {
        double sum = 0;
        for (int value : arr) {
            sum += Math.pow(value - mean, 2);
        }
        //double variance = sum / arr.length;
        return Math.sqrt(sum / arr.length);
    }

    public static void processNumbers(int low, int high, boolean odd) {
        int counter = 0;

        // First pass – count how many match
        for (int i = low; i <= high; i++) {
            if ((odd && i % 2 != 0) || (!odd && i % 2 == 0)) {
                counter++;
            }
        }

        int[] k = new int[counter];
        int index = 0;
        double sum = 0;

        // Second pass – fill array
        for (int i = low; i <= high; i++) {
            if ((odd && i % 2 != 0) || (!odd && i % 2 == 0)) {
                k[index++] = i;
                sum += i;
            }
        }

        if (k.length == 0) {
            System.out.println("No numbers found in this category.");
            return;
        }

        double mean = sum / k.length;
        double stdDev = standardDeviation(k, mean);

        System.out.println((odd ? "Odd" : "Even") + " Numbers: " + Arrays.toString(k));
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);

        System.out.println("Factorials:");
        for (int value : k) {
            System.out.println(value + "! = " + factorial(value));
        }

        int primeCount = 0;

        for (int value : k) {
            if (isPrime(value)) primeCount++;
        }

        int[] primes = new int[primeCount];
        int pIndex = 0;

        for (int value : k) {
            if (isPrime(value))
                primes[pIndex++] = value;
        }

        System.out.println("Primes: " + Arrays.toString(primes));
    }

    public static void main(String[] args) {
        int low = 0;
        int high = 80;

        System.out.println("ODD NUMBERS");
        processNumbers(low, high, true);

        System.out.println("\nEVEN NUMBERS");
        processNumbers(low, high, false);
    }
}
