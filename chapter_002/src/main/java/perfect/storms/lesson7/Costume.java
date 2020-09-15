package perfect.storms.lesson7;

public class Costume {

    private int size;
    private String color;

    public Costume(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Costume{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
