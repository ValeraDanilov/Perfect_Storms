package perfect.storms.lesson2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HumanTest {

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
    }

    @Test
    public void whenReturnHashCodeObject() {
        assertThat(new Human("Julia").hashCode(), is(71933768));
    }
}
