import java.util.LinkedList;
import java.util.List;

class CustomThreadPool {
    private final List<Worker> workers;
    private final LinkedList<Runnable> taskQueue;
    private final int poolSize;

    public CustomThreadPool(int poolSize) {
        this.poolSize = poolSize;
        taskQueue = new LinkedList<>();
        workers = new LinkedList<>();

        for (int i = 0; i < poolSize; i++) {
            Worker worker = new Worker();
            worker.start();
            workers.add(worker);
        }
    }

    public void execute(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.addLast(task);
            taskQueue.notify();
        }
    }

    private class Worker extends Thread {
        public void run() {
            while (true) {
                Runnable task;
                synchronized (taskQueue) {
                    while (taskQueue.isEmpty()) {
                        try {
                            taskQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = taskQueue.removeFirst();
                }
                task.run();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CustomThreadPool pool = new CustomThreadPool(3);

        Runnable task = () -> System.out.println("Task executed by: " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            pool.execute(task);
        }
    }
}
