package perfect.storms.lesson11;

public class SuperType {

    private int age;

    public SuperType(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SuperType{" +
                "age=" + age +
                '}';
    }
}
