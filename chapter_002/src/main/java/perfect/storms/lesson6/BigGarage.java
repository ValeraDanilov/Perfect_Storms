package perfect.storms.lesson6;

public class BigGarage implements Garages {

    private final int size = 2;
    private static int count;

    public int getSize() {
        return size;
    }

    @Override
    public boolean enter(Vehicle vehicle) {
        boolean result = false;
        if (size > count) {
            count++;
            result = true;
            System.out.println("Car parked, number of cars in the garage " + count);
        } else {
            System.out.println("Garage is full");
        }
        return result;
    }

    @Override
    public boolean leave() {
        boolean result = false;
        if (count == size) {
            result = true;
            count--;
            System.out.println("The car left the garage, number of cars in the garage " + count);
        } else {
            System.out.println("Garage is empty");
        }
        return result;
    }
}
