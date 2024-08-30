public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });
        t1.start();
        t1.interrupt();
    }
}
