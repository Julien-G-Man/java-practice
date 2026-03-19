import java.util.Scanner;

public class MobileDataMonitor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 20.0;     // Initial data balance in GB
        double totalUsed = 0.0;    // Total data used

        while (balance > 0) {
            System.out.print("Enter data used for this session (GB): ");
            double used = input.nextDouble();

            if (used < 0) {
                System.out.println("Error: Data usage cannot be negative.");
                continue;
            }

            if (balance - used < 0) {
                System.out.println("Insufficient balance");
                continue;
            }

            balance -= used;
            totalUsed += used;

            if (balance > 5) {
                System.out.println("Data balance is sufficient.");
            } else if (balance > 1) {
                System.out.println("Warning: Data balance is low.");
            } else if (balance > 0) {
                System.out.println("Critical: Data almost exhausted.");
            } else {
                System.out.println("Data exhausted. Internet disconnected.");
            }

            System.out.printf("Current data balance: %.2f GB%n", balance);
        }

        System.out.printf("\nTotal data used: %.2f GB%n", totalUsed);
        System.out.printf("Final data balance: %.2f GB%n", balance);

        input.close();
    }
}
