import java.util.Scanner;

public class KioskSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double BURGER_PRICE = 5.99;
        final double FRIES_PRICE = 2.50;

        double grandTotal = 0.0;
        int totalItems = 0;
        int choice;

        do {
            System.out.println("\n--- Fast Food Kiosk ---");
            System.out.println("1. Burger ($5.99)");
            System.out.println("2. Fries ($2.50)");
            System.out.println("3. Checkout");
            System.out.print("Select an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity of Burgers: ");
                    int burgerQty = input.nextInt();

                    if (burgerQty < 0) {
                        System.out.println("Error: Quantity cannot be negative.");
                    } else {
                        grandTotal += burgerQty * BURGER_PRICE;
                        totalItems += burgerQty;
                        System.out.println("Added " + burgerQty + " Burger(s) to cart.");
                    }
                    break;

                case 2:
                    System.out.print("Enter quantity of Fries: ");
                    int friesQty = input.nextInt();

                    if (friesQty < 0) {
                        System.out.println("Error: Quantity cannot be negative.");
                    } else {
                        grandTotal += friesQty * FRIES_PRICE;
                        totalItems += friesQty;
                        System.out.println("Added " + friesQty + " Fries to cart.");
                    }
                    break;

                case 3:
                    System.out.println("\nChecking out...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 3);

        System.out.println("\n--- Order Summary ---");
        System.out.println("Total items purchased: " + totalItems);
        System.out.printf("Final bill amount: $%.2f%n", grandTotal);

        input.close();
    }
}
