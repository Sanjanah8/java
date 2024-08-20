abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 5000, 1000);
        manager.displayDetails();
        System.out.println("Salary: " + manager.calculateSalary());

        Employee developer = new Developer("Bob", 102, 50, 160);
        developer.displayDetails();
        System.out.println("Salary: " + developer.calculateSalary());
    }
}
