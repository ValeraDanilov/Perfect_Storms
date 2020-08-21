package perfect.storms.lesson2;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        return hash * 17 + name.hashCode();
    }
}
