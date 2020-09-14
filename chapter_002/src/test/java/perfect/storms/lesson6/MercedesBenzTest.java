package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MercedesBenzTest {

    MercedesBenz mercedesBenz;

    @Before
    public void setUp() {
        mercedesBenz = new MercedesBenz(50, 50, 50);
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        this.mercedesBenz = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateCarAudi() {
        assertThat(this.mercedesBenz.toString(), is(new MercedesBenz(50, 50, 50).toString()));
    }

    @Test
    public void whenCheckMaxSpeed() {
        assertThat(this.mercedesBenz.getNumberSeats(), is(50));
    }
}