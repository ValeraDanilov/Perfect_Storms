package perfect.storms.lesson12.white;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PawnWhileTest {

    private PawnWhite white;

    @Before
    public void setUp() {
        System.out.println("before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        this.white = null;
    }

    @Test
    public void whenCreateObjectPawnWhite() {
        this.white = new PawnWhite(Cell.A7);
        assertThat(this.white.position(), is(Cell.A7));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new PawnWhite(Cell.A7).copy(Cell.A6);
        assertThat(new PawnWhite(Cell.A6).position(), is(figure.position()));
    }

    @Test
    public void whenWayE1ToE2() {
        this.white = new PawnWhite(Cell.A2);
        assertThat(this.white.way(Cell.A2, Cell.A3), is(new Cell[]{Cell.A3}));
    }

    @Test
    public void whenWayE1ToE() {
        this.white = new PawnWhite(Cell.A2);
        assertThat(this.white.way(Cell.A2, Cell.A3), is(new Cell[]{Cell.A3}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA2ToA1() {
        new PawnWhite(Cell.A2).way(Cell.A2, Cell.A1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA2ToB1() {
        new PawnWhite(Cell.A2).way(Cell.A2, Cell.B1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA2ToB2() {
        new PawnWhite(Cell.A2).way(Cell.A2, Cell.B2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayA2ToB3() {
        new PawnWhite(Cell.A2).way(Cell.A2, Cell.B3);
    }

    @Test
    public void whenCoordinatesFalse() {
        this.white = new PawnWhite(Cell.A2);
        assertThat(this.white.coordinates(Cell.A7, Cell.A6), is(false));
    }

    @Test
    public void whenCoordinatesTrue() {
        this.white = new PawnWhite(Cell.A2);
        assertThat(this.white.coordinates(Cell.A2, Cell.A3), is(true));
    }
}
