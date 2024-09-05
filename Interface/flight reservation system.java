// Reservation interface
interface Reservation {
    void bookTicket();
    void cancelTicket();
    void getTicketDetails();
}

// Economy class
class Economy implements Reservation {
    private String passengerName;
    private double ticketPrice = 100.0;
    private boolean booked = false;

    public Economy(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public void bookTicket() {
        booked = true;
        System.out.println("Economy ticket booked for " + passengerName + ". Price: $" + ticketPrice);
    }

    @Override
    public void cancelTicket() {
        if (booked) {
            booked = false;
            System.out.println("Economy ticket canceled for " + passengerName + ". Cancellation fee: $10");
        } else {
            System.out.println("No ticket to cancel.");
        }
    }

    @Override
    public void getTicketDetails() {
        if (booked) {
            System.out.println("Economy ticket for " + passengerName + ". Price: $" + ticketPrice);
        } else {
            System.out.println("No ticket booked.");
        }
    }
}

// Business class
class Business implements Reservation {
    private String passengerName;
    private double ticketPrice = 300.0;
    private boolean booked = false;

    public Business(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public void bookTicket() {
        booked = true;
        System.out.println("Business ticket booked for " + passengerName + ". Price: $" + ticketPrice);
    }

    @Override
    public void cancelTicket() {
        if (booked) {
            booked = false;
            System.out.println("Business ticket canceled for " + passengerName + ". Cancellation fee: $30");
        } else {
            System.out.println("No ticket to cancel.");
        }
    }

    @Override
    public void getTicketDetails() {
        if (booked) {
            System.out.println("Business ticket for " + passengerName + ". Price: $" + ticketPrice);
        } else {
            System.out.println("No ticket booked.");
        }
    }
}

// FirstClass class
class FirstClass implements Reservation {
    private String passengerName;
    private double ticketPrice = 500.0;
    private boolean booked = false;

    public FirstClass(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public void bookTicket() {
        booked = true;
        System.out.println("FirstClass ticket booked for " + passengerName + ". Price: $" + ticketPrice);
    }

    @Override
    public void cancelTicket() {
        if (booked) {
            booked = false;
            System.out.println("FirstClass ticket canceled for " + passengerName + ". Cancellation fee: $50");
        } else {
            System.out.println("No ticket to cancel.");
        }
    }

    @Override
    public void getTicketDetails() {
        if (booked) {
            System.out.println("FirstClass ticket for " + passengerName + ". Price: $" + ticketPrice);
        } else {
            System.out.println("No ticket booked.");
        }
    }
}

// Main class
public class FlightReservationSystem {
    public static void main(String[] args) {
        Reservation economy = new Economy("John Doe");
        Reservation business = new Business("Jane Smith");
        Reservation firstClass = new FirstClass("Alice Brown");

        economy.bookTicket();
        economy.getTicketDetails();
        economy.cancelTicket();

        business.bookTicket();
        firstClass.bookTicket();
        firstClass.getTicketDetails();
    }
}
