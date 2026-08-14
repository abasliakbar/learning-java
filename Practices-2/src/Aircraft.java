public class Aircraft {
    String model;
    String manufacturer;
    int maxPassengers;
    int maxSpeed;

    Aircraft(String model,String manufacturer,int maxPassengers,int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.manufacturer = manufacturer;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString(){
        return "Model: " + model + " Max speed: " + maxSpeed + " Max passengers: " + maxPassengers + " Manufacturer: " + manufacturer;
    }
}
