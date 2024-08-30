public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread woke up after sleeping");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
    }
}
