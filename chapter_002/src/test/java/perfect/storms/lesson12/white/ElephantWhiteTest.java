package perfect.storms.lesson12.white;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ElephantWhiteTest {

    private ElephantWhite white;

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
    public void whenCreateObjectElephantWhite() {
        this.white = new ElephantWhite(Cell.C1);
        assertThat(this.white.position(), is(Cell.C1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new ElephantWhite(Cell.C1).copy(Cell.D2);
        assertThat(new ElephantWhite(Cell.D2).position(), is(figure.position()));
    }

    @Test
    public void whenWayC1ToG5() {
        this.white = new ElephantWhite(Cell.C1);
        assertThat(this.white.way(Cell.C1, Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void whenWayG5GToC1() {
        this.white = new ElephantWhite(Cell.G5);
        assertThat(white.way(Cell.G5, Cell.C1), is(new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoDiagonalWay() {
        new ElephantWhite(Cell.C1).way(Cell.C1, Cell.E2);
    }

    @Test
    public void whenDiagonal() {
        this.white = new ElephantWhite(Cell.C1);
        assertThat(this.white.isDiagonal(Cell.C1, Cell.A8), is(false));
    }
}
