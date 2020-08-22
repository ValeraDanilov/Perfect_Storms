package perfect.storms.lesson3;

public class Doctor extends Employee implements Intellectual {

    public Doctor(String name, int age) {
        super(name, age);
    }

    public void heal() {
        System.out.println("Heals");
    }

    @Override
    void workInfo() {
    }
}
