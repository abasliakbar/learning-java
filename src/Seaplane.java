public class Seaplane implements Flyable, Swimmable{
    String model;
    Seaplane(String model){
        this.model = model;
    }
    @Override
    public void fly(){
        System.out.println("[Model]: " + model + " is flying over the sea!");
    }
    @Override
    public void swim(){
        System.out.println("[Model]: " + model + " is swimming on water!");
    }
}
