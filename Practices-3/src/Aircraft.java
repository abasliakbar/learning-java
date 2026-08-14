import java.util.Arrays;
public class Aircraft implements Flyable {
    private String manufacturer;
    private String model;
    private int maxSpeed;
    private String[] passengers;
    private Pilot pilot;
    Aircraft(String manufacturer,String model,int maxSpeed,String[] passengers,Pilot pilot){
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
        this.pilot = pilot;
    }
    //Getter
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public Pilot getPilot(){
        return pilot;
    }
    public String[] getPassengers(){
        return passengers;
    }
    //Setter
    public void setModel(String model){
        this.model = model;
    }
    public void setPilot(Pilot pilot){
        this.pilot = pilot;
    }
    public void setManufacturer(String manufacturer){
        if (manufacturer.isEmpty()){
            System.out.println("True");
        }
        else{
            this.manufacturer = manufacturer;
        }

    }
    public void setMaxSpeed(int maxSpeed){
        if (maxSpeed < 0){
            System.out.println("The speed cannot be lower than 0.");
            //System.out.printf("");
        }
        else{
            this.maxSpeed = maxSpeed;
        }
    }
    public void setPassengers(String[] passengers){
        if (passengers == null || passengers.length == 0){
            System.out.print("Null");
        }
        else {
            this.passengers = passengers;
        }

    }
    @Override
    public String toString(){
        return "Pilot: " + pilot + "\n" +manufacturer  + " " + model  + " "  + Arrays.toString(passengers) + " "  + maxSpeed;
    }

    @Override
    public void fly(){
        System.out.println(manufacturer + " " + model + " has been take-off.");
    }
}
