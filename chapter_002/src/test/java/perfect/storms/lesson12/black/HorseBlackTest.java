package perfect.storms.lesson12.black;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HorseBlackTest {

    private HorseBlack black;

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
    public void whenCreateObjectHorseBlack() {
        this.black = new HorseBlack(Cell.B1);
        assertThat(this.black.position(), is(Cell.B1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new HorseBlack(Cell.B1).copy(Cell.A3);
        assertThat(new HorseBlack(Cell.A3).position(), is(figure.position()));
    }

    @Test
    public void whenWayB1ToA3() {
        this.black = new HorseBlack(Cell.B1);
        assertThat(black.way(Cell.B1, Cell.A3), is(new Cell[]{Cell.A3}));
    }

    @Test
    public void whenWayA3ToB1() {
        this.black = new HorseBlack(Cell.A3);
        assertThat(black.way(Cell.A3, Cell.B1), is(new Cell[]{Cell.B1}));
    }

    @Test
    public void whenWayB1ToC3() {
        this.black = new HorseBlack(Cell.B1);
        assertThat(black.way(Cell.B1, Cell.C3), is(new Cell[]{Cell.C3}));
    }

    @Test
    public void whenWayC3ToB1() {
        this.black = new HorseBlack(Cell.C3);
        assertThat(black.way(Cell.C3, Cell.B1), is(new Cell[]{Cell.B1}));
    }

    @Test
    public void whenWayB1ToD2() {
        this.black = new HorseBlack(Cell.B1);
        assertThat(black.way(Cell.B1, Cell.D2), is(new Cell[]{Cell.D2}));
    }
    @Test
    public void whenWayD2ToB1() {
        this.black = new HorseBlack(Cell.D2);
        assertThat(black.way(Cell.D2, Cell.B1), is(new Cell[]{Cell.B1}));
    }


    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToB3() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.B3);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToC2() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.C2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToB2() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.B2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToA2() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.A2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToA1() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.A1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToC1() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.C1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToA4() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.A4);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToD1() {
        new HorseBlack(Cell.B1).way(Cell.B1, Cell.D1);
    }

    @Test
    public void whenCoordinatesTrue() {
        this.black = new HorseBlack(Cell.B1);
        assertThat(this.black.coordinates(Cell.B1, Cell.A3), is(true));
    }

    @Test
    public void whenCoordinatesFalse() {
        this.black = new HorseBlack(Cell.B1);
        assertThat(this.black.coordinates(Cell.B1, Cell.A4), is(false));
    }
}
