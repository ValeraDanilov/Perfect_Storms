package perfect.storms.lesson12.white;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RookWhiteTest {

    private RookWhite white;

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
    public void whenCreateObjectRookBlack() {
        this.white = new RookWhite(Cell.A1);
        assertThat(this.white.position(), is(Cell.A1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new RookWhite(Cell.A1).copy(Cell.A8);
        assertThat(new RookWhite(Cell.A8).position(), is(figure.position()));
    }

    @Test
    public void whenWayA1ToA8() {
        this.white = new RookWhite(Cell.A1);
        assertThat(this.white.way(Cell.A1, Cell.A8), is(new Cell[]{Cell.A2, Cell.A3, Cell.A4, Cell.A5, Cell.A6, Cell.A7, Cell.A8}));
    }

    @Test
    public void whenWayA8ToA1() {
        this.white = new RookWhite(Cell.A8);
        assertThat(white.way(Cell.A8, Cell.A1), is(new Cell[]{Cell.A7, Cell.A6, Cell.A5, Cell.A4, Cell.A3, Cell.A2, Cell.A1}));
    }

    @Test
    public void whenWayA1ToH1() {
        this.white = new RookWhite(Cell.A1);
        assertThat(white.way(Cell.A1, Cell.H1), is(new Cell[]{Cell.B1, Cell.C1, Cell.D1, Cell.E1, Cell.F1, Cell.G1, Cell.H1}));
    }

    @Test
    public void whenWayH1ToA1() {
        this.white = new RookWhite(Cell.H1);
        assertThat(white.way(Cell.H1, Cell.A1), is(new Cell[]{Cell.G1, Cell.F1, Cell.E1, Cell.D1, Cell.C1, Cell.B1, Cell.A1}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWay() {
        new RookWhite(Cell.A1).way(Cell.A1, Cell.H8);
    }

    @Test
    public void whenCoordinatesFalse() {
        this.white = new RookWhite(Cell.A1);
        assertThat(this.white.coordinates(Cell.A1, Cell.H2), is(false));
    }

    @Test
    public void whenCoordinatesTrue() {
        this.white = new RookWhite(Cell.A1);
        assertThat(this.white.coordinates(Cell.A1, Cell.A2), is(true));
    }
}
