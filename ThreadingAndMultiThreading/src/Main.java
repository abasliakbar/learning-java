public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable task = new MyRunnable();
        Thread t1 = new Thread(task);
        t1.start();
        t1.join();
        System.out.println("Main thread finished");
    }
}