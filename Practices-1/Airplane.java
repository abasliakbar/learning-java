public abstract class Airplane {
    String modelName;

    Airplane(String modelName){
        this.modelName = modelName;
    }

    void land(){
        System.out.println("[Model]: " + modelName + "is landing safely on my runway.");
    }
    abstract void fly();
}
