package perfect.storms.lesson12.black;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PawnBlackTest {

    private PawnBlack black;

    @Before
    public void setUp() {
        System.out.println("before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        this.black = null;
    }

    @Test
    public void whenCreateObjectPawnBlack() {
        this.black = new PawnBlack(Cell.A7);
        assertThat(this.black.position(), is(Cell.A7));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new PawnBlack(Cell.A7).copy(Cell.A6);
        assertThat(new PawnBlack(Cell.A6).position(), is(figure.position()));
    }

    @Test
    public void whenWayA7ToA6() {
        this.black = new PawnBlack(Cell.A7);
        assertThat(this.black.way(Cell.A7, Cell.A6), is(new Cell[]{Cell.A6}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA7ToA8() {
        new PawnBlack(Cell.A7).way(Cell.A7, Cell.A8);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA7ToB7() {
        new PawnBlack(Cell.A7).way(Cell.A7, Cell.B7);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA7ToB8() {
        new PawnBlack(Cell.A7).way(Cell.A7, Cell.B8);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA7ToB6() {
        new PawnBlack(Cell.A7).way(Cell.A7, Cell.B6);
    }

    @Test
    public void whenCoordinatesFalse() {
        this.black = new PawnBlack(Cell.A7);
        assertThat(this.black.coordinates(Cell.A7, Cell.B8), is(false));
    }

    @Test
    public void whenCoordinatesTrue() {
        this.black = new PawnBlack(Cell.A7);
        assertThat(this.black.coordinates(Cell.A7, Cell.A6), is(true));
    }
}
