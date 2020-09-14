package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MazdaSixTest {

    MazdaSix mazdaSix;

    @Before
    public void setUp() {
        mazdaSix = new MazdaSix(50, 50, 50);
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        this.mazdaSix = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateCarAudi() {
        assertThat(this.mazdaSix.toString(), is(new MazdaSix(50, 50, 50).toString()));
    }

    @Test
    public void whenCheckMaxSpeed() {
        assertThat(this.mazdaSix.getPower(), is(50));
        assertThat(this.mazdaSix.getSize(), is(50));
        assertThat(this.mazdaSix.getMaxSpeed(), is(50));
    }

}