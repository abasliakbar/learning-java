import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
           //  objects
            HashMap<String, Integer> hashMap = new HashMap<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("**********");
            System.out.println("Register [R] or Login[L]");
            System.out.println("**********");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("l")) {
                System.out.println("**********\n" +
                        " LOGIN\n" +
                        "**********");
                System.out.print("Email: ");
                String reg_email = scanner.next();
                System.out.print("Password: ");
            }
            // register
            System.out.println("**********\n" +
                    " REGISTER\n" +
                    "**********");
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("New password: ");
            int password = scanner.nextInt();
            System.out.print("Re-enter your new password: ");
            password = scanner.nextInt();
            System.out.println("New user has written successful!");

            //login


    }
}