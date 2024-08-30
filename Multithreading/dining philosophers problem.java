import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private Semaphore leftFork;
    private Semaphore rightFork;

    public Philosopher(Semaphore leftFork, Semaphore rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            while (true) {
                // Thinking
                Thread.sleep((int) (Math.random() * 100));

                // Hungry
                leftFork.acquire();
                rightFork.acquire();

                // Eating
                System.out.println(Thread.currentThread().getName() + " is eating");
                Thread.sleep((int) (Math.random() * 100));

                // Done Eating
                leftFork.release();
                rightFork.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Semaphore[] forks = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1);
        }

        for (int i = 0; i < 5; i++) {
            new Philosopher(forks[i], forks[(i + 1) % 5]).start();
        }
    }
}
