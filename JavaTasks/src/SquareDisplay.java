import java.util.Scanner;

public class SquareDisplay {
    static Scanner scanner = new Scanner(System.in);

    static void displaySquare(int n) {
        String x = "X";
        for (int i = 0; i < n; i++) {
            String result = x.repeat(n);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number between 0-15: ");
        int number = scanner.nextInt();

        System.out.println("\nDisplaying square...");
        displaySquare(number);
    }
}
