package perfect.storms.lesson12.black;

import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

public class QueenBlack implements Figure {

    private final Cell position;

    public QueenBlack(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell start, Cell finish) {
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

    @Override
    public Figure copy(Cell dest) {
        return new QueenBlack(dest);
    }
}
