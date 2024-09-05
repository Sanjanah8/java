interface FitnessActivity {
    void startActivity();
    void endActivity();
    String getActivitySummary();
}

class Running implements FitnessActivity {
    private String summary = "Running: Distance covered 5 km.";

    @Override
    public void startActivity() {
        System.out.println("Running activity started.");
    }

    @Override
    public void endActivity() {
        System.out.println("Running activity ended.");
    }

    @Override
    public String getActivitySummary() {
        return summary;
    }
}

class Swimming implements FitnessActivity {
    private String summary = "Swimming: Distance covered 2 km.";

    @Override
    public void startActivity() {
        System.out.println("Swimming activity started.");
    }

    @Override
    public void endActivity() {
        System.out.println("Swimming activity ended.");
    }

    @Override
    public String getActivitySummary() {
        return summary;
    }
}

public class FitnessTrackerSystem {
    public static void main(String[] args) {
        FitnessActivity running = new Running();
        running.startActivity();
        running.endActivity();
        System.out.println(running.getActivitySummary());

        FitnessActivity swimming = new Swimming();
        swimming.startActivity();
        swimming.endActivity();
        System.out.println(swimming.getActivitySummary());
    }
}
