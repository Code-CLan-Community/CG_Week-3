import java.util.*;
public class TicketReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketReservationSystem system = new TicketReservationSystem();

        System.out.println("\n--- Online Ticket Reservation System ---");

        // Book Ticket
        System.out.print("Enter Ticket ID: ");
        int ticketID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Booking Time: ");
        String bookingTime = scanner.nextLine();
        system.addTicket(ticketID, customerName, movieName, seatNumber, bookingTime);

        // Display Tickets
        system.displayTickets();

        // Search Ticket
        System.out.print("\nEnter Customer Name or Movie Name to search: ");
        String searchQuery = scanner.nextLine();
        system.searchTicket(searchQuery);

        // Count Tickets
        System.out.println("\nTotal booked tickets: " + system.countTickets());

        // Cancel Ticket
        System.out.print("\nEnter Ticket ID to cancel: ");
        int cancelID = scanner.nextInt();
        system.removeTicket(cancelID);

        // Display Tickets After Cancellation
        system.displayTickets();

        scanner.close();
    }
}
