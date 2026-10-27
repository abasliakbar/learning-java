import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        bankAccount userAccount = new bankAccount();
        Scanner scanner = new Scanner(System.in);
        float balance = 0;
        float deposit;
        float withdraw;
        boolean isRunning = true;

        while (isRunning){
            System.out.println("[1] balance");
            System.out.println("[2] deposit");
            System.out.println("[3] withdraw");
            System.out.println("[4] exit");
            int userChoose = scanner.nextInt();
            if (userChoose == 1) {
                System.out.println("-------------------");
                System.out.println("Balance: " + userAccount.getBalance() + "$");
                System.out.println("-------------------");
            } else if (userChoose == 2) {
                deposit = scanner.nextFloat();
                balance += deposit;
                userAccount.setBalance(balance);

            } else if (userChoose == 3) {
                withdraw = scanner.nextFloat();
                balance -= withdraw;
                userAccount.setBalance(balance);

            } else{
                System.out.print("See you later :)");
                isRunning = false;
            }
        }

        System.out.println(userAccount.getBalance());
        userAccount.setBalance(balance);
        System.out.println(userAccount.getBalance());

    }
}