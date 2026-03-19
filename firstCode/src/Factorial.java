import java.util.Scanner;

public class Factorial {
    static Scanner scanner = new Scanner(System.in);

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("n must be greater than 0");
            return 0;
        }

        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    public static void main(String[] args) {
        int n, factorial;
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        factorial = factorial(n);
        System.out.println(n +" factorial = "+ factorial);
    }
}
