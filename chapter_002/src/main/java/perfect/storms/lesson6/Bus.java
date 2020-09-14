package perfect.storms.lesson6;

public abstract class Bus extends Vehicle {

    private int numberSeats;

    public Bus(int size, int power, int numberSeats) {
        super(size, power);
        this.numberSeats = numberSeats;
    }


    public int getNumberSeats() {
        return numberSeats;
    }
}
