public class Pilot {
    String name = "Jack";
    int age;
    int height;
    Pilot(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;

    }
    @Override
    public String toString(){
        return "\n[Name]: " + name + "\n[Age]: " + age + "\n[Height]: " + height;
    }
}
