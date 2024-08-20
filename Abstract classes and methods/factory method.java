abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}

class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }
}

class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIAL")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();

        Plan plan = planFactory.getPlan("DOMESTIC");
        plan.getRate();
       
      plan.calculateBill(250); // Output: 875.0

            Plan plan2 = planFactory.getPlan("COMMERCIAL");
            plan2.getRate();
            plan2.calculateBill(250); // Output: 1875.0
        }
    }
