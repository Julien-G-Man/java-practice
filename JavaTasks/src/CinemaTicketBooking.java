import java.util.Scanner;

public class CinemaTicketBooking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        int totalTickets = 0;
        double totalCost = 0.0;

        do {
            System.out.println("\n===== CINEMA TICKET MENU =====");
            System.out.println("1. Regular Ticket (₵25.00)");
            System.out.println("2. Student Ticket (₵15.00)");
            System.out.println("3. VIP Ticket (₵50.00)");
            System.out.println("4. Finish Booking");
            System.out.print("Select an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalTickets++;
                    totalCost += 25.00;
                    break;

                case 2:
                    totalTickets++;
                    totalCost += 15.00;
                    break;

                case 3:
                    totalTickets++;
                    totalCost += 50.00;
                    break;

                case 4:
                    // Exit loop
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 4);

        System.out.println("\n========== SUMMARY ==========");

        if (totalTickets == 0) {
            System.out.println("No tickets booked.");
        } else {
            if (totalTickets <= 3) {
                System.out.println("Booking type: Standard booking");
            } else {
                System.out.println("Booking type: Group booking");
            }

            System.out.println("Total tickets: " + totalTickets);
            System.out.printf("Total cost: ₵%.2f%n", totalCost);
        }
    }
}
