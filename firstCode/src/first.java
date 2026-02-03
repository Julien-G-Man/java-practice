import java.util.Scanner;

public class first {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    static void printDetails(String name, int age) {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }

    public static void main(String[] args) {
        printDetails("John", 20);
        printDetails("Paul", 25);

        System.out.println("Hello world");
        System.out.println("Let's print a sequence of numbers\n");

        for (int i = 0; i <= 10; i++) {
            System.out.println("i = "+ i);
        }

        System.out.println("\nNow lets do some math, shall we?!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the  value of b: ");
        int b = scanner.nextInt();

        int Sum = first.add(a, b);
        System.out.println("The sum is "+ Sum);

        int product = first.multiply(a, b);
        System.out.println("The product is "+ product);
    }

}
