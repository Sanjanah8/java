import java.util.concurrent.Semaphore;

class SharedResource {
    private Semaphore semaphore = new Semaphore(1);

    public void useResource() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is using resource");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has finished using resource");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::useResource);
        Thread t2 = new Thread(resource::useResource);

        t1.start();
        t2.start();
    }
}
