import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting");
                latch.await();
                System.out.println(Thread.currentThread().getName() + " started");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
            System.out.println("Countdown...");
            latch.countDown();
            latch.countDown();
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
