public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> System.out.println("Thread 1 is running"));
        t1.start();
        t1.join();
        System.out.println("Thread 1 has finished");
    }
}
