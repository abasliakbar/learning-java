public class FighterJet extends Airplane{

    FighterJet(String modelName){
        super(modelName);
    }
    @Override
    void fly(){
        System.out.println("[Model]: " + modelName + " is flying at supersonic speed!");
    }
}
