package perfect.storms.lesson12.white;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.Cell;
import perfect.storms.lesson12.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HorseWhiteTest {
    
    private HorseWhite white;

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
    public void whenCreateObjectHorseBlack() {
        this.white = new HorseWhite(Cell.B1);
        assertThat(this.white.position(), is(Cell.B1));
    }

    @Test
    public void whenCheckNewPosition() {
        Figure figure = new HorseWhite(Cell.B1).copy(Cell.A3);
        assertThat(new HorseWhite(Cell.A3).position(), is(figure.position()));
    }

    @Test
    public void whenWayB1ToA3() {
        this.white = new HorseWhite(Cell.B1);
        assertThat(white.way(Cell.B1, Cell.A3), is(new Cell[]{Cell.A3}));
    }

    @Test
    public void whenWayA3ToB1() {
        this.white = new HorseWhite(Cell.A3);
        assertThat(white.way(Cell.A3, Cell.B1), is(new Cell[]{Cell.B1}));
    }

    @Test
    public void whenWayB1ToC3() {
        this.white = new HorseWhite(Cell.B1);
        assertThat(white.way(Cell.B1, Cell.C3), is(new Cell[]{Cell.C3}));
    }

    @Test
    public void whenWayC3ToB1() {
        this.white = new HorseWhite(Cell.C3);
        assertThat(white.way(Cell.C3, Cell.B1), is(new Cell[]{Cell.B1}));
    }

    @Test
    public void whenWayB1ToD2() {
        this.white = new HorseWhite(Cell.B1);
        assertThat(white.way(Cell.B1, Cell.D2), is(new Cell[]{Cell.D2}));
    }
    @Test
    public void whenWayD2ToB1() {
        this.white = new HorseWhite(Cell.D2);
        assertThat(white.way(Cell.D2, Cell.B1), is(new Cell[]{Cell.B1}));
    }


    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToB3() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.B3);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToC2() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.C2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToB2() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.B2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToA2() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.A2);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToA1() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.A1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToC1() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.C1);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToA4() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.A4);
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoWayB1ToD1() {
        new HorseWhite(Cell.B1).way(Cell.B1, Cell.D1);
    }

    @Test
    public void whenCoordinatesTrue() {
        this.white = new HorseWhite(Cell.B1);
        assertThat(this.white.coordinates(Cell.B1, Cell.A3), is(true));
    }

    @Test
    public void whenCoordinatesFalse() {
        this.white = new HorseWhite(Cell.B1);
        assertThat(this.white.coordinates(Cell.B1, Cell.A4), is(false));
    }
}
