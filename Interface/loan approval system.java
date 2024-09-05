// LoanApproval interface
interface LoanApproval {
    boolean approveLoan(double income, int creditScore, double loanAmount);
}

// HomeLoan class
class HomeLoan implements LoanApproval {
    @Override
    public boolean approveLoan(double income, int creditScore, double loanAmount) {
        if (income > 50000 && creditScore > 700 && loanAmount < income * 5) {
            System.out.println("Home loan approved.");
            return true;
        }
        System.out.println("Home loan rejected.");
        return false;
    }
}

// PersonalLoan class
class PersonalLoan implements LoanApproval {
    @Override
    public boolean approveLoan(double income, int creditScore, double loanAmount) {
        if (income > 30000 && creditScore > 650 && loanAmount < income * 3) {
            System.out.println("Personal loan approved.");
            return true;
        }
        System.out.println("Personal loan rejected.");
        return false;
    }
}

// CarLoan class
class CarLoan implements LoanApproval {
    @Override
    public boolean approveLoan(double income, int creditScore, double loanAmount) {
        if (income > 20000 && creditScore > 600 && loanAmount < income * 2) {
            System.out.println("Car loan approved.");
            return true;
        }
        System.out.println("Car loan rejected.");
        return false;
    }
}

// Main class
public class LoanApprovalSystem {
    public static void main(String[] args) {
        LoanApproval homeLoan = new HomeLoan();
        LoanApproval personalLoan = new PersonalLoan();
        LoanApproval carLoan = new CarLoan();

        // Test loan approvals
        homeLoan.approveLoan(60000, 750, 250000);   // Should be approved
        personalLoan.approveLoan(40000, 680, 100000); // Should be approved
        carLoan.approveLoan(15000, 650, 30000);      // Should be rejected
    }
}
