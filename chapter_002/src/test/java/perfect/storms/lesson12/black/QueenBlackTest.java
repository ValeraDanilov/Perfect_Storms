package perfect.storms.lesson12.black;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class QueenBlackTest {

    private QueenBlack black;

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
    public void whenCreateObjectQueenBlack() {
        this.black = new QueenBlack(Cell.D1);
        assertThat(this.black.position(), is(Cell.D1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new QueenBlack(Cell.D1).copy(Cell.D8);
        assertThat(new QueenBlack(Cell.D8).position(), is(figure.position()));
    }

    @Test
    public void whenWayD1ToD8() {
        this.black = new QueenBlack(Cell.D1);
        assertThat(this.black.way(Cell.D1, Cell.D8), is(new Cell[]{Cell.D2, Cell.D3, Cell.D4, Cell.D5, Cell.D6, Cell.D7, Cell.D8}));
    }

    @Test
    public void whenWayD1ToH5() {
        this.black = new QueenBlack(Cell.D1);
        assertThat(black.way(Cell.D1, Cell.H5), is(new Cell[]{Cell.E2, Cell.F3, Cell.G4, Cell.H5}));
    }
}
