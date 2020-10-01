package perfect.storms.lesson12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import perfect.storms.lesson12.black.KingBlack;
import perfect.storms.lesson12.black.PawnBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicTest {

    private Logic logic;

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
    }

    @Test
    public void whenCreateObjectAndAddFigure() {
        this.logic = new Logic();
        this.logic.add(new KingBlack(Cell.E2));
        assertThat(this.logic.toString(), is("Logic{figure=[KingBlack{position=E2}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}"));
    }

    @Test
    public void whenCreateObjectAndAddFigureAndCheckWayFalse() {
        this.logic = new Logic();
        this.logic.add(new KingBlack(Cell.E1));
        this.logic.add(new PawnBlack(Cell.E2));
        assertThat(this.logic.move(Cell.E1, Cell.E2), is(false));
    }

    @Test
    public void whenCreateObjectAndAddFigureAndCheckWayTrue() {
        this.logic = new Logic();
        this.logic.add(new KingBlack(Cell.E1));
        assertThat(this.logic.move(Cell.E1, Cell.E2), is(true));
    }

    @Test
    public void whenCreateObjectAndAddFigureAndCheckWay() {
        this.logic = new Logic();
        this.logic.add(new KingBlack(Cell.E1));
        assertThat(this.logic.move(Cell.E1, Cell.G5), is(false));
    }
}
