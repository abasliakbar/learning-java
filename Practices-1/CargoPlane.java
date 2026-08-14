public class CargoPlane extends Airplane{

    CargoPlane(String modelName){
        super(modelName);
    }

    @Override
    void fly(){
        System.out.println("[Model]: " + modelName +" is flying slowly with heavy cargo.");
    }

}
