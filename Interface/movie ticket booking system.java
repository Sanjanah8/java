interface MovieTicket {
    void bookSeat(String seatNumber);
    void cancelSeat(String seatNumber);
    String getTicketDetails();
}

class StandardTicket implements MovieTicket {
    private String seatNumber;

    @Override
    public void bookSeat(String seatNumber) {
        this.seatNumber = seatNumber;
        System.out.println("Standard seat " + seatNumber + " booked.");
    }

    @Override
    public void cancelSeat(String seatNumber) {
        this.seatNumber = null;
        System.out.println("Standard seat " + seatNumber + " canceled.");
    }

    @Override
    public String getTicketDetails() {
        return "Standard Ticket, Seat Number: " + seatNumber;
    }
}

class VIPTicket implements MovieTicket {
    private String seatNumber;

    @Override
    public void bookSeat(String seatNumber) {
        this.seatNumber = seatNumber;
        System.out.println("VIP seat " + seatNumber + " booked.");
    }

    @Override
    public void cancelSeat(String seatNumber) {
        this.seatNumber = null;
        System.out.println("VIP seat " + seatNumber + " canceled.");
    }

    @Override
    public String getTicketDetails() {
        return "VIP Ticket, Seat Number: " + seatNumber;
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket standardTicket = new StandardTicket();
        standardTicket.bookSeat("A10");
        System.out.println(standardTicket.getTicketDetails());
        standardTicket.cancelSeat("A10");

        MovieTicket vipTicket = new VIPTicket();
        vipTicket.bookSeat("B5");
        System.out.println(vipTicket.getTicketDetails());
        vipTicket.cancelSeat("B5");
    }
}
