package perfect.storms.lesson12.white;

import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

public class ElephantWhite implements Figure {

    private final Cell position;

    public ElephantWhite(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell start, Cell end) {
        if (!isDiagonal(start, end)) {
            throw new IllegalStateException(String.format("Could not move by diagonal from %s to %s", start, end));
        }
        int size = Math.abs(end.x - start.x);
        Cell[] steps = new Cell[size];
        int deltaX = Integer.compare(end.x, start.x);
        int deltaY = Integer.compare(end.y, start.y);
        for (int index = 0; index < size; index++) {
            int x = start.x + deltaX * (index + 1);
            int y = start.y + deltaY * (index + 1);
            steps[index] = Cell.search(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y);
    }

    @Override
    public Figure copy(Cell dest) {
        return new ElephantWhite(dest);
    }
}
