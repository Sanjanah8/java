import java.util.ArrayList;
import java.util.List;

class Flight {
    private String flightNumber;
    private String destination;
    private int availableSeats;

    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat booked successfully. Remaining seats: " + availableSeats);
        } else {
            System.out.println("No available seats.");
        }
    }

    public void cancelSeat() {
        availableSeats++;
        System.out.println("Booking cancelled. Available seats: " + availableSeats);
    }
}

public class FlightReservation {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("FL123", "New York", 10));
        flights.add(new Flight("FL456", "London", 5));

        // Book a flight
        for (Flight flight : flights) {
            if (flight.getDestination().equals("New York")) {
                flight.bookSeat();
            }
        }

        // Cancel a booking
        for (Flight flight : flights) {
            if (flight.getDestination().equals("New York")) {
                flight.cancelSeat();
            }
        }
    }
}
