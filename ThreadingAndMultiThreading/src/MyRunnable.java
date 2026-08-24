public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 10; i >= 0; i--){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("THREAD WAS INTERRUPTED");
            }
            if (i == 0){
                System.out.println("Times up!");
            }
        }



    }
}
