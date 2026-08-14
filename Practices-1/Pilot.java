public class Pilot {
    String name;
    String license;
    float flightHours;

    Pilot(String name,String license,float flightHours){

    }
    @Override
    public String toString(){
        return "[Pilot]: " + name + "\n[License]: " + license + "\n[Flight hours]: " + flightHours;
    }
}
