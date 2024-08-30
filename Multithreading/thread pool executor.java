import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        Runnable task = () -> {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 10; i++) {
            executor.execute(task);
        }

        executor.shutdown();
    }
}
