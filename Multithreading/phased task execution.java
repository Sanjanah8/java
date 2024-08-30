import java.util.concurrent.Phaser;

class Worker extends Thread {
    private Phaser phaser;

    public Worker(Phaser phaser) {
        this.phaser = phaser;
        phaser.register();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Phase 1");
        phaser.arriveAndAwaitAdvance();

        System.out.println(Thread.currentThread().getName() + " Phase 2");
        phaser.arriveAndAwaitAdvance();

        System.out.println(Thread.currentThread().getName() + " Phase 3");
        phaser.arriveAndDeregister();
    }
}

public class Main {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);

        for (int i = 0; i < 3; i++) {
            new Worker(phaser).start();
        }

        for (int i = 0; i < 3; i++) {
            phaser.arriveAndAwaitAdvance();
        }

        phaser.arriveAndDeregister();
        System.out.println("All phases completed");
    }
}
