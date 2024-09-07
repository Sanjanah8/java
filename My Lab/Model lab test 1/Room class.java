class Room {
    private int roomNo;
    private String roomType;
    private double roomArea;
    private boolean isAC;

    public Room(int roomNo, String roomType, double roomArea, boolean isAC) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.isAC = isAC;
    }

    public void displayData() {
        System.out.println("Room No: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea);
        System.out.println("AC: " + (isAC ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Room r = new Room(101, "Deluxe", 300.5, true);
        r.displayData();
    }
}
