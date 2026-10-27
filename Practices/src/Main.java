public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyRunnable task = new MyRunnable();
        Thread thread1 = new Thread(task);
        thread1.start();
    }
}