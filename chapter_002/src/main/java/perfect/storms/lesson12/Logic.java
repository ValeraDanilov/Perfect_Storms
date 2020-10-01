package perfect.storms.lesson12;

import java.util.Arrays;

public class Logic {

    private final Figure[] figure = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figure[this.index++] = figure;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figure.length; index++) {
            if (this.figure[index] != null && this.figure[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    private boolean isWayFree(Cell[] way) {
        boolean rsl = true;
        for (Cell step : way) {
            if (findBy(step) != -1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        try {
            int index = this.findBy(source);
            if (index != -1) {
                Cell[] steps = this.figure[index].way(source, dest);
                if (steps.length > 0 && steps[steps.length - 1].equals(dest) && isWayFree(steps)) {
                    rst = true;
                    this.figure[index] = this.figure[index].copy(dest);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rst;
    }

    @Override
    public String toString() {
        return "Logic{" + "figure=" + Arrays.toString(figure) + '}';
    }
}
