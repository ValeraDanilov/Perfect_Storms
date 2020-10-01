package perfect.storms.lesson12.black;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class KingBlackTest {

    private KingBlack black;
    @Before
    public void setUp() {
        System.out.println("before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        black = null;
    }

    @Test
    public void whenCreateObjectKingBlack() {
        this.black = new KingBlack(Cell.E1);
        assertThat(this.black.position(), is(Cell.E1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new KingBlack(Cell.E1).copy(Cell.E2);
        assertThat(new KingBlack(Cell.E2).position(), is(figure.position()));
    }

    @Test
    public void whenWayE1ToE2() {
        this.black = new KingBlack(Cell.E1);
        assertThat(this.black.way(Cell.E1, Cell.E2), is(new Cell[]{Cell.E2}));
    }

    @Test
    public void whenWayE2ToE1() {
        this.black = new KingBlack(Cell.E2);
        assertThat(black.way(Cell.E2, Cell.E1), is(new Cell[]{Cell.E1}));
    }

    @Test
    public void whenWayE1ToD1() {
        this.black = new KingBlack(Cell.E1);
        assertThat(black.way(Cell.E1, Cell.D1), is(new Cell[]{Cell.D1}));
    }

    @Test
    public void whenWayE1ToF1() {
        this.black = new KingBlack(Cell.E1);
        assertThat(black.way(Cell.E1, Cell.F1), is(new Cell[]{Cell.F1}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWay() {
        new KingBlack(Cell.E1).way(Cell.E1, Cell.E3);
    }

    @Test
    public void whenCoordinatesFalse() {
        this.black = new KingBlack(Cell.E1);
        assertThat(this.black.coordinates(Cell.E1, Cell.A8), is(false));
    }
}
