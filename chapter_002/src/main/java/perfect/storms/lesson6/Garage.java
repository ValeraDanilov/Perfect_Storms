package perfect.storms.lesson6;

public class Garage implements Garages {
        private final static int SIZE = 1;
        private static int count;

    public int getSize() {
        return SIZE;
    }

    @Override
    public boolean enter(Vehicle vehicle) {
        boolean result = false;
        if ((vehicle instanceof Car || vehicle instanceof Truck) && count < SIZE) {
            count++;
            result = true;
            System.out.println("Car parked, number of cars in the garage " + count);
        } else {
            System.out.println("Garage is full or you trying to park other type car");
        }
        return result;
    }

    @Override
    public boolean leave() {
        boolean result = false;
        if (count == SIZE) {
            result = true;
            count--;
            System.out.println("The car left the garage, number of cars in the garage " + count);
        } else {
            System.out.println("Garage is empty");
        }
        return result;
    }
}
