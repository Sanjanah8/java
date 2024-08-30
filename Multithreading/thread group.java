public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");

        Thread t1 = new Thread(group, () -> System.out.println("Thread 1"));
        Thread t2 = new Thread(group, () -> System.out.println("Thread 2"));

        t1.start();
        t2.start();
        System.out.println("Thread Group: " + group.getName());
    }
}
