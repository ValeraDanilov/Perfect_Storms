package perfect.storms.lesson12.white;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class KingWhiteTest {

    private KingWhite white;

    @Before
    public void setUp() {
        System.out.println("before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        white = null;
    }

    @Test
    public void whenCreateObjectKingWhite() {
        this.white = new KingWhite(Cell.E2);
        assertThat(this.white.position(), is(Cell.E2));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new KingWhite(Cell.E1).copy(Cell.E2);
        assertThat(new KingWhite(Cell.E2).position(), is(figure.position()));
    }

    @Test
    public void whenWayE1ToE2() {
        this.white = new KingWhite(Cell.E1);
        assertThat(this.white.way(Cell.E1, Cell.E2), is(new Cell[]{Cell.E2}));
    }

    @Test
    public void whenWayE2ToE1() {
        this.white = new KingWhite(Cell.E2);
        assertThat(white.way(Cell.E2, Cell.E1), is(new Cell[]{Cell.E1}));
    }

    @Test
    public void whenWayE1ToD1() {
        this.white = new KingWhite(Cell.E1);
        assertThat(white.way(Cell.E1, Cell.D1), is(new Cell[]{Cell.D1}));
    }

    @Test
    public void whenWayE1ToF1() {
        this.white = new KingWhite(Cell.E1);
        assertThat(white.way(Cell.E1, Cell.F1), is(new Cell[]{Cell.F1}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWay() {
        new KingWhite(Cell.E1).way(Cell.E1, Cell.E3);
    }

    @Test
    public void whenCoordinatesFalse() {
        this.white = new KingWhite(Cell.E1);
        assertThat(this.white.coordinates(Cell.E1, Cell.A8), is(false));
    }
}
