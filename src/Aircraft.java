public class Aircraft {
    private String model;
    private int maxSpeed;
    private double fuelLevel;

    Aircraft(String model, int maxSpeed,double fuelLevel){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelLevel = fuelLevel;
    }
    //Getters
    public String getModel(){
        return model;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setMaxSpeed(int maxSpeed){
        if (maxSpeed < 0){
            System.out.println("Error!");
        }
        else{
            this.maxSpeed = maxSpeed;
        }
    }
    public void setFuelLevel(double fuelLevel){
        if (fuelLevel < 0 || fuelLevel > 100){
            System.out.println("Unknown fuel level!");
        }
        else{
            this.fuelLevel = fuelLevel;
        }
    }
}
