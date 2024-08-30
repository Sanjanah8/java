class Resource {
    public synchronized void method1(Resource r) {
        System.out.println("Method1");
        r.method2(this);
    }

    public synchronized void method2(Resource r) {
        System.out.println("Method2");
        r.method1(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method1(r2));
        Thread t2 = new Thread(() -> r2.method1(r1));

        t1.start();
        t2.start();
    }
}
