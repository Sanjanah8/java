abstract class Vehicle {
    abstract void startEngine();

    final void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine(); // Car engine started.
        car.stopEngine();  // Engine stopped.

        Vehicle bike = new Bike();
        bike.startEngine(); // Bike engine started.
        bike.stopEngine();  // Engine stopped.
    }
}
