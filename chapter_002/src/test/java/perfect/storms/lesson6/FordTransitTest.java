package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FordTransitTest {

    FordTransit ford;

    @Before
    public void setUp() {
       this.ford = new FordTransit(50, 50, 50);
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        this.ford = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateCarAudi() {
        assertThat(this.ford.toString(), is(new FordTransit(50, 50, 50).toString()));
    }

    @Test
    public void whenCheckMaxSpeed() {
        assertThat(this.ford.getNumberSeats(), is(50));
    }
}