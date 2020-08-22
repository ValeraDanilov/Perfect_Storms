package perfect.storms.lesson3;

public class Builder extends Employee implements Strongman {

    public Builder(String name, int age) {
        super(name, age);
    }

    public void build() {
        System.out.println("Builds");
    }

    @Override
    void workInfo() {
    }
}
