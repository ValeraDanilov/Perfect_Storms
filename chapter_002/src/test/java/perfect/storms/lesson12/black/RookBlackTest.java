package perfect.storms.lesson12.black;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RookBlackTest {

    private RookBlack black;

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
    public void whenCreateObjectRookBlack() {
        this.black = new RookBlack(Cell.A1);
        assertThat(this.black.position(), is(Cell.A1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new RookBlack(Cell.A1).copy(Cell.A8);
        assertThat(new RookBlack(Cell.A8).position(), is(figure.position()));
    }

    @Test
    public void whenWayD2ToC2() {
        this.black = new RookBlack(Cell.D2);
        assertThat(this.black.way(Cell.D2, Cell.C2), is(new Cell[]{Cell.C2}));
    }

    @Test
    public void whenWayC2ToD2() {
        this.black = new RookBlack(Cell.C2);
        assertThat(black.way(Cell.C2, Cell.D2), is(new Cell[]{Cell.D2}));
    }

    @Test
    public void whenWayB2ToC2() {
        this.black = new RookBlack(Cell.B2);
        assertThat(black.way(Cell.B2, Cell.C2), is(new Cell[]{Cell.C2}));
    }

    @Test
    public void whenWayC2ToB2() {
        this.black = new RookBlack(Cell.C2);
        assertThat(black.way(Cell.C2, Cell.B2), is(new Cell[]{Cell.B2}));
    }

    @Test
    public void whenWayC2ToC3() {
        this.black = new RookBlack(Cell.C2);
        assertThat(black.way(Cell.C2, Cell.C3), is(new Cell[]{Cell.C3}));
    }

    @Test
    public void whenWayC3ToC2() {
        this.black = new RookBlack(Cell.C3);
        assertThat(black.way(Cell.C3, Cell.C2), is(new Cell[]{Cell.C2}));
    }

    @Test
    public void whenWayC2ToC1() {
        this.black = new RookBlack(Cell.C2);
        assertThat(black.way(Cell.C2, Cell.C1), is(new Cell[]{Cell.C1}));
    }

    @Test
    public void whenWayC1ToC2() {
        this.black = new RookBlack(Cell.C1);
        assertThat(black.way(Cell.C1, Cell.C2), is(new Cell[]{Cell.C2}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayC2ToB1() {
        new RookBlack(Cell.C2).way(Cell.C2, Cell.B1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayC2ToD1() {
        new RookBlack(Cell.C2).way(Cell.C2, Cell.D1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayC2ToD3() {
        new RookBlack(Cell.C2).way(Cell.C2, Cell.D3);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayC2ToB3() {
        new RookBlack(Cell.C2).way(Cell.C2, Cell.B3);
    }

    @Test
    public void whenCoordinatesFalse() {
        this.black = new RookBlack(Cell.A1);
        assertThat(this.black.coordinates(Cell.A1, Cell.H2), is(false));
    }

    @Test
    public void whenCoordinatesTrue() {
        this.black = new RookBlack(Cell.A1);
        assertThat(this.black.coordinates(Cell.A1, Cell.A2), is(true));
    }
}
