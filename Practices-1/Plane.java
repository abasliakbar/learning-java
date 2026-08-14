public class Plane {
    String model;
    String airline;
    int maxSpeed;

    Plane(String model, int maxSpeed, String airline){
        this.airline = airline;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    @Override
    public String toString(){
        return "[Model]: " + model + "\n[Airline]: " + airline + "\n[Max speed]: " + maxSpeed;
    }
}
