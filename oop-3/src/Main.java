import java.util.Arrays;

public class Main {
    /*
    public static void makeFly(Flyable plane){
        plane.fly();
    }
     */

    public static void main(String[] args){
        String[] passengers = {"Ali", "Akbar", "Jack", "John"};
        passengers[1] = "David";
        //Objects
        Pilot pilot = new Pilot("Jack",12, 67);
        //Flyable aircraft = new Aircraft("Boeing" , "A350-1000", 927,pilot);
        Flyable helicopter = new Helicopter("Boeing", "AH-64 Apache", 293);
        Aircraft aircraft = new Aircraft(
                "Airbus",
                "A319",
                100,
                passengers,
                pilot);
        String[] new_passengers = {"Akbar", "Ali", "Murad"};
        aircraft.setPassengers(new_passengers);
        System.out.printf(Arrays.toString(aircraft.getPassengers()));
        System.out.println(aircraft.getMaxSpeed());
        aircraft.setManufacturer("Boeing");
        aircraft.setModel("777-800");
        aircraft.setMaxSpeed(-7);
        System.out.println("*******************");
        System.out.println(aircraft.getManufacturer());
        System.out.println(aircraft.getModel());
        System.out.println("*******************");

        //Fly
        System.out.println(aircraft);
        //aircraft.fly();
        //helicopter.fly();
        //toString
        //System.out.println(aircraft);
        //System.out.println(pilot);
        //.out.println(helicopter);
        //makeFly(aircraft);
        //makeFly(helicopter);
    }
}