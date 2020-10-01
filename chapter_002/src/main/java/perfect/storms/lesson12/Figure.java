package perfect.storms.lesson12;

public interface Figure {

    Cell position();

    Cell[] way(Cell start, Cell end);

    Figure copy(Cell dest);
}
