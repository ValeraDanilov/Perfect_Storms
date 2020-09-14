package perfect.storms.lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HyundaiMightyTest {

    HyundaiMighty hyundai;

    @Before
    public void setUp() {
        this.hyundai = new HyundaiMighty(50, 50, 50);
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        this.hyundai = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateCarAudi() {
        assertThat(this.hyundai.toString(), is(new HyundaiMighty(50, 50, 50).toString()));
    }

    @Test
    public void whenCheckMaxSpeed() {
        assertThat(this.hyundai.getMaxWeight(), is(50));
    }

}