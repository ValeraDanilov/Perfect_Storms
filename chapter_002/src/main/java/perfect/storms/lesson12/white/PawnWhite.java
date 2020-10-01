package perfect.storms.lesson12.white;

import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

public class PawnWhite implements Figure {

    private final Cell position;

    public PawnWhite(Cell position) {
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
        return new Cell[] {dest};
    }

    public boolean coordinates(Cell source, Cell dest) {
        boolean result = false;
        if (source.y == dest.y - 1 && source.x == dest.x) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnWhite(dest);
    }
}
