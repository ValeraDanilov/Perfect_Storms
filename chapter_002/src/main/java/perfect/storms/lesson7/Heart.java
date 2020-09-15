package perfect.storms.lesson7;

public class Heart {

    private int liters;
    private double time;

    public Heart(int liters, double time) {
        this.liters = liters;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "liters=" + liters +
                ", time=" + time +
                '}';
    }
}
