import java.util.Scanner;

public class CinemaBooking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int totalTickets = 0;
        int totalCost = 0;
        String bookingClass;

        do {
            System.out.println("=========================");
            System.out.println("Cinema booking system");
            System.out.println("-------------------------");
            System.out.println("Option 1 (Regular): ₵25.00");
            System.out.println("Option 2 (Student): ₵15.00");
            System.out.println("Option 3 (VIP): ₵50.00");
            System.out.println("Option 4 : Exit \n");
            System.out.println("Enter an option");

            choice = scanner.nextInt();

            switch (choice) {
                case 1, 2, 3:
                    totalTickets++;
                    totalCost++;
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid input");
            }

        } while (choice != 4);

        if (totalTickets == 0) {
            System.out.println("No ticket was purchased");
        } else {
            if (totalTickets >= 1 && totalTickets <= 3) bookingClass = "Standard Booking";
            else bookingClass = "Group Booking";

            System.out.println("=========================");
            System.out.println("SUMMARY");
            System.out.println("-------------------------\n");
            System.out.println("Total number of tickets: " + totalTickets);
            System.out.println("Booking class: " + bookingClass);
            System.out.println("Total Cost:" + totalCost);
            System.out.println("-------------------------\n");
        }
    }
}