public class Helicopter implements Flyable {
    String brand;
    String model;
    int maxSpeed;

    Helicopter(String brand, String model,int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    @Override
    public String toString(){
        return "[Brand]: " + brand + "\n[Model]: " + model + "\n[Max speed]: " + maxSpeed;
    }
    @Override
    public void fly() {
        System.out.println(brand + " " + model + " is take-off vertically and it's max speed is " + maxSpeed + "km/h");

    }

}
