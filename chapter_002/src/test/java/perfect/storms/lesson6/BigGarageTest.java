package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BigGarageTest {
    private PrintStream print = System.out;
    private ByteArrayOutputStream mem = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.out.println("Before method");
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        System.setOut(this.print);
    }

    @Test
    public void whenCreateBigGarageWithCar() {
        BigGarage bigGarage = new BigGarage();
        bigGarage.leave();
        bigGarage.enter(new AudiA5(10, 20, 30));
        bigGarage.enter(new MercedesBenz(10, 20, 30));
        bigGarage.enter(new HyundaiMighty(10, 20, 30));
        bigGarage.leave();
        bigGarage.enter(new HyundaiMighty(10, 20, 30));
        bigGarage.leave();
        bigGarage.enter(new AudiA5(10, 20, 30));
        assertThat(mem.toString(), is("Garage is empty" +
                System.lineSeparator() + "Car parked, number of cars in the garage 1" +
                System.lineSeparator() + "Car parked, number of cars in the garage 2" +
                System.lineSeparator() + "Garage is full" +
                System.lineSeparator() + "The car left the garage, number of cars in the garage 1" +
                System.lineSeparator() + "Car parked, number of cars in the garage 2" +
                System.lineSeparator() + "The car left the garage, number of cars in the garage 1" +
                System.lineSeparator() + "Car parked, number of cars in the garage 2" + System.lineSeparator()));
    }

    @Test
    public void whenReturnSize() {
        int number = new BigGarage().getSize();
        assertThat(number, is(2));
    }
}
