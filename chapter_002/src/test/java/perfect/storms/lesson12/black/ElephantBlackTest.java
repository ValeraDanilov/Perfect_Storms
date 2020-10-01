package perfect.storms.lesson12.black;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ElephantBlackTest {

    private ElephantBlack black;
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
    public void whenCreateObjectElephantBlack() {
        this.black = new ElephantBlack(Cell.C1);
        assertThat(this.black.position(), is(Cell.C1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new ElephantBlack(Cell.C1).copy(Cell.D2);
        assertThat(new ElephantBlack(Cell.D2).position(), is(figure.position()));
    }

    @Test
    public void whenWayDiagonalRomCToG5() {
        this.black = new ElephantBlack(Cell.C1);
        assertThat(this.black.way(Cell.C1, Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void whenWayDiagonalRomGToC1() {
        this.black = new ElephantBlack(Cell.G5);
        assertThat(black.way(Cell.G5, Cell.C1), is(new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoDiagonalWay() {
        new ElephantBlack(Cell.C1).way(Cell.C1, Cell.E2);
    }

    @Test
    public void whenDiagonal() {
        this.black = new ElephantBlack(Cell.C1);
        assertThat(this.black.isDiagonal(Cell.C1, Cell.A8), is(false));
    }
}
