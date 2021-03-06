package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MiniGarageTest {

    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.out.println("before method");
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        System.setOut(this.out);
    }

    @Test
    public void whenCreateBigGarageWithCar() {
        MiniGarage garage = new MiniGarage();
        garage.leave();
        garage.enter(new AudiA5(10, 20, 30));
        garage.enter(new MazdaSix(10, 20, 30));
        garage.leave();
        garage.enter(new HyundaiMighty(10, 20, 30));
        garage.enter(new MercedesBenz(10, 20, 30));
        garage.enter(new MazdaSix(10, 20, 30));
        assertThat(mem.toString(), is("Garage is empty" +
                System.lineSeparator() + "Car parked, number of cars in the garage 1" +
                System.lineSeparator() + "Garage is full or you trying to park other type car" +
                System.lineSeparator() + "The car left the garage, number of cars in the garage 0" +
                System.lineSeparator() + "Garage is full or you trying to park other type car" +
                System.lineSeparator() + "Garage is full or you trying to park other type car" +
                System.lineSeparator() + "Car parked, number of cars in the garage 1" + System.lineSeparator()));
    }

    @Test
    public void whenReturnSize() {
        int number = new MiniGarage().getSize();
        assertThat(number, is(1));
    }
}