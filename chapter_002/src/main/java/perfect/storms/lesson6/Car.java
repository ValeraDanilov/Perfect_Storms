package perfect.storms.lesson6;

public abstract class Car extends Vehicle {

    private int maxSpeed;

    public Car(int size, int power, int maxSpeed) {
        super(size, power);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
