public class Author {
    String name;

    Author(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}