package perfect.storms.lesson12.white;

import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

public class HorseWhite implements Figure {

    private final Cell position;

    public HorseWhite(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!coordinates(source, dest)) {
            throw new IllegalStateException(String.format("Could not move by given coordinates from %s to %s", source, dest));
        }
        return new Cell[]{dest};
    }

    public boolean coordinates(Cell source, Cell dest) {
        boolean result = false;
        int deltaX = Math.abs(dest.x - source.x);
        int deltaY = Math.abs(dest.y - source.y);
        if ((deltaX == 1 && deltaY == 2) || (deltaX == 2 && deltaY == 1)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new HorseWhite(dest);
    }
}
