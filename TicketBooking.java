// Shared ticket counter
class TicketCounter {
    private int tickets = 1; // only 1 ticket available

    // Synchronized method to prevent overbooking
    public synchronized void bookTicket(String customerName) {
        if (tickets > 0) {
            System.out.println(customerName + " is trying to book...");
            try {
                Thread.sleep(1000); // simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets--;
            System.out.println(customerName + " successfully booked the ticket!");
        } else {
            System.out.println(customerName + " could NOT book. Ticket already sold.");
        }
    }
}

// Customer thread
class Customer extends Thread {
    private TicketCounter counter;
    private String customerName;

    public Customer(TicketCounter counter, String customerName) {
        this.counter = counter;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        counter.bookTicket(customerName);
    }
}

public class TicketBooking {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        // Two customers trying to book the same last ticket
        Customer c1 = new Customer(counter, "Customer 1");
        Customer c2 = new Customer(counter, "Customer 2");

        c1.start();
        c2.start();
    }
}
