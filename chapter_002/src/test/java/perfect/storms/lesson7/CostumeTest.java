package perfect.storms.lesson7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CostumeTest {

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
    }

    @Test
    public void whenCreateObjectCostume() {
        assertThat(new Costume(58, "Black").toString(), is(new Costume(58, "Black").toString()));
    }
}
