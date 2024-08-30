public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running");
            }
        });
        t1.setDaemon(true);
        t1.start();
    }
}
