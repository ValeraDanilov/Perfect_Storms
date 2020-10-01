package perfect.storms.lesson12.white;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class QueenWhiteTest {

    private QueenWhite white;

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
    public void whenCreateObjectQueenWhite() {
        this.white = new QueenWhite(Cell.D1);
        assertThat(this.white.position(), is(Cell.D1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new QueenWhite(Cell.D1).copy(Cell.D8);
        assertThat(new QueenWhite(Cell.D8).position(), is(figure.position()));
    }

    @Test
    public void whenWayD1ToD8() {
        this.white = new QueenWhite(Cell.D1);
        assertThat(this.white.way(Cell.D1, Cell.D8), is(new Cell[]{Cell.D2, Cell.D3, Cell.D4, Cell.D5, Cell.D6, Cell.D7, Cell.D8}));
    }

    @Test
    public void whenWayD1ToH5() {
        this.white = new QueenWhite(Cell.D1);
        assertThat(white.way(Cell.D1, Cell.H5), is(new Cell[]{Cell.E2, Cell.F3, Cell.G4, Cell.H5}));
    }

}