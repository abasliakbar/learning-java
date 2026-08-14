public class Boat implements Swimmable{
    String model;
    Boat(String model){
        this.model = model;
    }
    @Override
    public void swim(){
        System.out.println("[Model]: " + model + " is sailing on the ocean.");
    }
}
