import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your task: ");
        Timer timer = new Timer();
        String userInput = scanner.nextLine();
        System.out.print("Enter number of tasks: ");
        TimerTask timerTask = new TimerTask() {
            int count = scanner.nextInt();
            @Override
            public void run() {

                System.out.println(userInput);
                count --;
                if (count <= 0){
                    System.out.println("*******************");
                    System.out.println("Task was completed!");
                    System.out.println("*******************");
                    timer.cancel();
                }

            }
        };
        timer.schedule(timerTask, 0, 1000);
    }
}