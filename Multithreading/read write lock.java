import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource {
    private int data = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(int value) {
        lock.writeLock().lock();
        try {
            data = value;
            System.out.println("Data written: " + data);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int read() {
        lock.readLock().lock();
        try {
            System.out.println("Data read: " + data);
            return data;
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread writer = new Thread(() -> resource.write(42));
        Thread reader1 = new Thread(resource::read);
        Thread reader2 = new Thread(resource::read);

        writer.start();
        reader1.start();
        reader2.start();
    }
}
