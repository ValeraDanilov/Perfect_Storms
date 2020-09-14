package perfect.storms.lesson6;

public abstract class Truck extends Vehicle {

    private int maxWeight;

    public Truck(int size, int power, int maxWeight) {
        super(size, power);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
