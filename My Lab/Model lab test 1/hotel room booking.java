import java.util.ArrayList;
import java.util.List;

class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Room " + roomNumber + " booking cancelled.");
        } else {
            System.out.println("Room " + roomNumber + " is not booked.");
        }
    }
}

public class HotelBooking {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101));
        rooms.add(new Room(102));

        // Book a room
        for (Room room : rooms) {
            if (room.getRoomNumber() == 101) {
                room.bookRoom();
            }
        }

        // Cancel booking
        for (Room room : rooms) {
            if (room.getRoomNumber() == 101) {
                room.cancelBooking();
            }
        }
    }
}
