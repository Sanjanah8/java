interface Vehicle {
    void rent();
    void returnVehicle();
    double calculateRent();
}

class Car implements Vehicle {
    private double dailyRate = 50.0;

    @Override
    public void rent() {
        System.out.println("Car rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned.");
    }

    @Override
    public double calculateRent() {
        return dailyRate;
    }
}

class Bike implements Vehicle {
    private double dailyRate = 20.0;

    @Override
    public void rent() {
        System.out.println("Bike rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned.");
    }

    @Override
    public double calculateRent() {
        return dailyRate;
    }
}

class Truck implements Vehicle {
    private double dailyRate = 100.0;

    @Override
    public void rent() {
        System.out.println("Truck rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Truck returned.");
    }

    @Override
    public double calculateRent() {
        return dailyRate;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.rent();
        System.out.println("Car rent: $" + car.calculateRent());
        car.returnVehicle();

        Vehicle bike = new Bike();
        bike.rent();
        System.out.println("Bike rent: $" + bike.calculateRent());
        bike.returnVehicle();

        Vehicle truck = new Truck();
        truck.rent();
        System.out.println("Truck rent: $" + truck.calculateRent());
        truck.returnVehicle();
    }
}
