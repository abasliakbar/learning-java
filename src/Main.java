import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Airbus A350-1000", 970, 67.5);

        System.out.println("Model: " + aircraft.getModel());
        System.out.println("Fuel: " + aircraft.getFuelLevel() + "%");

        aircraft.setFuelLevel(150.5);
        aircraft.setMaxSpeed(-932);

        System.out.println("Model: " + aircraft.getModel());
        System.out.println("Fuel: " + aircraft.getFuelLevel() + "%");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter #: ");
        int numOfFoods = scanner.nextInt();
        for (int i = 1; i <= numOfFoods; i++){
            System.out.print("Enter #"+ i + ": ");
            String food = scanner.next();
            foods.add(food);
        }
        System.out.println(foods);
    }
}