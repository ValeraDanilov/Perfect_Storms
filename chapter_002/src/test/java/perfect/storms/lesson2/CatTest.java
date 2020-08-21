package perfect.storms.lesson2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CatTest {

    @Before
    public void before() {
        System.out.println("Before method");
    }

    @After
    public void after() {
        System.out.println("After method");
    }

    @Test
    public void whenCreateThreeCats() {
        Cat burmilla = new Cat("Барсик", 5, "Burmilla");
        Cat toyger = new Cat("Мурка", 1, "Toyger");
        Cat manx = new Cat("Пыжык", 8, "Manx");
        assertThat(burmilla.toString(), is(new Cat("Барсик", 5, "Burmilla").toString()));
        assertThat(toyger.toString(), is(new Cat("Мурка", 1, "Toyger").toString()));
        assertThat(manx.toString(), is(new Cat("Пыжык", 8, "Manx").toString()));
    }
}
