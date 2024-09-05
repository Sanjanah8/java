// Employee interface
interface Employee {
    double calculateSalary();
    void getEmployeeDetails();
}

// FullTimeEmployee class
class FullTimeEmployee implements Employee {
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Full-Time Employee: " + name + ", Salary: $" + salary);
    }
}

// PartTimeEmployee class
class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Part-Time Employee: " + name + ", Hourly Wage: $" + hourlyWage + ", Hours Worked: " + hoursWorked);
    }
}

// ContractEmployee class
class ContractEmployee implements Employee {
    private String name;
    private double contractAmount;

    public ContractEmployee(String name, double contractAmount) {
        this.name = name;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Contract Employee: " + name + ", Contract Amount: $" + contractAmount);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("John", 50000);
        Employee partTime = new PartTimeEmployee("Jane", 20, 100);
        Employee contract = new ContractEmployee("Alice", 20000);

        fullTime.getEmployeeDetails();
        System.out.println("Salary: $" + fullTime.calculateSalary());

        partTime.getEmployeeDetails();
        System.out.println("Salary: $" + partTime.calculateSalary());

        contract.getEmployeeDetails();
        System.out.println("Salary: $" + contract.calculateSalary());
    }
}
