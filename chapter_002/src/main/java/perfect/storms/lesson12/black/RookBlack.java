package perfect.storms.lesson12.black;

import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

public class RookBlack implements Figure {

    private final Cell position;

    public RookBlack(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell start, Cell finish) {
        if (!coordinates(start, finish)) {
            throw new IllegalStateException(String.format("Could not move by given coordinates from %s to %s", start, finish));
        }
        int size = Math.abs(finish.x - start.x);
        if (size == 0) {
            size = Math.abs(finish.y - start.y);
        }
        Cell[] steps = new Cell[size];
        int deltaX = Integer.compare(finish.x, start.x);
        int deltaY = Integer.compare(finish.y, start.y);
        for (int index = 0; index < size; index++) {
            int x = start.x + deltaX * (index + 1);
            int y = start.y + deltaY * (index + 1);
            steps[index] = Cell.search(x, y);
        }
        return steps;
    }

    public boolean coordinates(Cell source, Cell dest) {
        boolean result = false;
        if ((source.x == dest.x && (source.y > dest.y || source.y < dest.y)) || ((source.x > dest.x || source.x < dest.x) && source.y == dest.y)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookBlack(dest);
    }
}
