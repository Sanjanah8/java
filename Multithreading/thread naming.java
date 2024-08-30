public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread is running"));
        t1.setName("MyThread");
        t1.start();
        System.out.println("Thread Name: " + t1.getName());
    }
}
