package perfect.storms.lesson12.black;

import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

public class KingBlack implements Figure {

    private final Cell position;

    public KingBlack(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell start, Cell end) {
        if (!coordinates(start, end)) {
            throw new IllegalStateException(String.format("Could not move by given coordinates from %s to %s", start, end));
        }
        return new Cell[]{end};
    }

    public boolean coordinates(Cell start, Cell end) {
        boolean result = false;
        if ((start.x == end.x + 1 || start.x == end.x - 1 || start.x == end.x) && (start.y == end.y + 1 || start.y == end.y - 1 || start.y == end.y)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingBlack(dest);
    }

    @Override
    public String toString() {
        return "KingBlack{" +
                "position=" + position +
                '}';
    }
}
