package perfect.storms.lesson4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LionTest {

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
    }

    @Test
    public void whenCountingObjects() {
       new Lion("Муфаса", 10);
       new Lion("Сараби", 8);
       int count =  new Lion("Симба", 3).returnCountObjects();
       assertThat(count, is(3));
    }

    @Test
    public void whenChangeNameObject() {
        Lion lion = new Lion("Шрам", 10);
        assertThat(lion.newNameLion(lion, "Муфаса").getName(), is("Муфаса"));
    }

    @Test
    public void whenCheckAgeObject() {
        Lion lion = new Lion("Муфаса", 10);
        assertThat(lion.getAge(), is(10));
    }
}
