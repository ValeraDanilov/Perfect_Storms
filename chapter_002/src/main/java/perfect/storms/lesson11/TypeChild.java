package perfect.storms.lesson11;

public class TypeChild extends SuperType {

    private String name;

    public TypeChild(int age, String name) {
        super(age);
        this.name = name;
    }

    @Override
    public String toString() {
        return "TypeChild{" +
                "name='" + name + '\'' +
                '}';
    }
}
