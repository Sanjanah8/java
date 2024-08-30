public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread is running"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println("Thread Priority: " + t1.getPriority());
    }
}
