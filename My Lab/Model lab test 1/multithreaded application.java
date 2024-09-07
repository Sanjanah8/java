import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final EvenNumberProcessor evenProcessor;
    private final OddNumberProcessor oddProcessor;

    public RandomNumberGenerator(EvenNumberProcessor evenProcessor, OddNumberProcessor oddProcessor) {
        this.evenProcessor = evenProcessor;
        this.oddProcessor = oddProcessor;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);
            System.out.println("Generated Number: " + number);
            if (number % 2 == 0) {
                evenProcessor.process(number);
            } else {
                oddProcessor.process(number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumberProcessor extends Thread {
    @Override
    public void run() {
        // This thread will be updated by RandomNumberGenerator
    }

    public void process(int number) {
        System.out.println("Square of " + number + ": " + (number * number));
    }
}

class OddNumberProcessor extends Thread {
    @Override
    public void run() {
        // This thread will be updated by RandomNumberGenerator
    }

    public void process(int number) {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}

public class Main {
    public static void main(String[] args) {
        EvenNumberProcessor evenProcessor = new EvenNumberProcessor();
        OddNumberProcessor oddProcessor = new OddNumberProcessor();

        RandomNumberGenerator generator = new RandomNumberGenerator(evenProcessor, oddProcessor);
        generator.start();
    }
}
