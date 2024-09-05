interface TrafficSignal {
    void changeSignalColor(String color);
    void manageTraffic();
    String getSignalStatus();
}

class PedestrianSignal implements TrafficSignal {
    private String status = "Red";

    @Override
    public void changeSignalColor(String color) {
        status = color;
        System.out.println("Pedestrian signal color changed to " + color);
    }

    @Override
    public void manageTraffic() {
        System.out.println("Managing pedestrian traffic.");
    }

    @Override
    public String getSignalStatus() {
        return status;
    }
}

class VehicleSignal implements TrafficSignal {
    private String status = "Green";

    @Override
    public void changeSignalColor(String color) {
        status = color;
        System.out.println("Vehicle signal color changed to " + color);
    }

    @Override
    public void manageTraffic() {
        System.out.println("Managing vehicle traffic.");
    }

    @Override
    public String getSignalStatus() {
        return status;
    }
}

public class SmartCityTrafficManagementSystem {
    public static void main(String[] args) {
        TrafficSignal pedestrianSignal = new PedestrianSignal();
        pedestrianSignal.changeSignalColor("Green");
        System.out.println("Pedestrian signal status: " + pedestrianSignal.getSignalStatus());
        pedestrianSignal.manageTraffic();

        TrafficSignal vehicleSignal = new VehicleSignal();
        vehicleSignal.changeSignalColor("Red");
        System.out.println("Vehicle signal status: " + vehicleSignal.getSignalStatus());
        vehicleSignal.manageTraffic();
    }
}
