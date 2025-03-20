import java.util.*;

class TicketReservationSystem{
    private Ticket head;

    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            head.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        System.out.println("Ticket booked successfully! Ticket ID: " + ticketID);
    }

    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets booked yet!");
            return;
        }

        Ticket temp = head, prev = null;

        if (head.ticketID == ticketID) {
            if (head.next == head) {
                head = null;
            } else {
                Ticket last = head;
                while (last.next != head) {
                    last = last.next;
                }
                head = head.next;
                last.next = head;
            }
            System.out.println("Ticket ID " + ticketID + " canceled successfully.");
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
            if (temp.ticketID == ticketID) {
                prev.next = temp.next;
                System.out.println("Ticket ID " + ticketID + " canceled successfully.");
                return;
            }
        } while (temp != head);

        System.out.println("Ticket ID " + ticketID + " not found!");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet!");
            return;
        }

        Ticket temp = head;
        System.out.println("\nCurrent Ticket Reservations:");
        do {
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets booked yet!");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        System.out.println("\nSearch Results:");
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for '" + query + "'.");
        }
    }

    public int countTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}