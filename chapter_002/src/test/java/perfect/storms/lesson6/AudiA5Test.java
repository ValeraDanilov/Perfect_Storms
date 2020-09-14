package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AudiA5Test {

    AudiA5 audi;

    @Before
    public void setUp() {
        audi = new AudiA5(50, 50, 50);
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        this.audi = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateCarAudi() {
        assertThat(this.audi.toString(), is(new AudiA5(50, 50, 50).toString()));
    }

    @Test
    public void whenCheckMaxSpeed() {
        assertThat(this.audi.getMaxSpeed(), is(50));
    }
}
