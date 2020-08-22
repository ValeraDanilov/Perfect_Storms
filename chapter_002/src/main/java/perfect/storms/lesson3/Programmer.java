package perfect.storms.lesson3;

public class Programmer extends Employee implements Intellectual {

    public Programmer(String name, int age) {
        super(name, age);
    }

    public void programming() {
        System.out.println("Programming");
    }

    @Override
    void workInfo() {

    }
}
