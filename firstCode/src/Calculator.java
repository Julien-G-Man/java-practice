import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Calculator {

    static List<int[]> get_values() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        List<int[]> values = new ArrayList<>();
        values.add(new int[]{a, b});

        return values;
    }
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int findFactorial(int n) {
        System.out.println("|====== FACTORIAL =====|");
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    static List<double[]> solve_quadratic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|====== QUADRATIC EQUATIONS =====|");

        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c: ");
        int c = scanner.nextInt();

        System.out.println("Your equation is "+ a +"x2 + "+b +"x + "+ c);

        int disc = b * b - (4 * a * c);
        double disc_root = Math.sqrt(disc);

        if (disc > 0) {
            System.out.println("The roots are real and unique");
        } else if (disc == 0) {
            System.out.println("The roots are real and equal");
        } else {
            System.out.println("The roots are imaginary");
        }

        double x1 = (-b + disc_root) / (2 * a);
        double x2 = (-b - disc_root) / (2 * a);

        List<double[]> numbers = new ArrayList<>();
        numbers.add(new double[]{x1, x2});

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("|======== Calculator Program ========|");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Addition \n2) Subtraction \n3) Multiplication \n4) Division \n5) Square \n6) Factorial \n7) Quadratic \n");
        System.out.println("What operation do you want to perform? (1/2/3/4/5/6/7): ");
        int choice = scanner.nextInt();

        // Conditions that require a two input values
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
            List<int[]> values = Calculator.get_values();
            int a = values.get(0)[0];
            int b = values.get(0)[1];

            if (choice == 1 ) {
                int Result = Calculator.add(a, b);
                System.out.println("The result is "+ Result);
            } else if (choice == 2) {
                int Result = Calculator.subtract(a, b);
                System.out.println("The result is "+ Result);
            } else if (choice == 3) {
                int Result = Calculator.multiply(a, b);
                System.out.println("The result is "+ Result);
            } else {
                int Result = Calculator.divide(a, b);
                System.out.println("The result is " + Result);
            }

        // Conditions that require a single input value
        } else if (choice == 5) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            double square = Math.pow(n, 2);
            System.out.println("The square of "+ n +" is "+square);

        } else if (choice == 6) {
            System.out.println("Enter the value of n: ");
            int n = scanner.nextInt();
            int factorial = Calculator.findFactorial(n);
            System.out.println(n + " factorial = " + factorial);

        } else if (choice == 7) {
            List<double[]> roots = Calculator.solve_quadratic();
            double x1 =  roots.get(0)[0];
            double x2 =  roots.get(0)[1];
            System.out.println("The roots are "+ x1 +" and "+ x2);
        } else {
            System.out.println("Please choose one of the given options!");
        }
    }
}
