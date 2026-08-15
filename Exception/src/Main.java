public class Main {
    public static void main(String[] args) {

        String[] names = {"Ali", "Akbar", "Jack"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong!");
        }

        System.out.println("Program continues...");
    }
}