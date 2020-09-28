package perfect.storms.lesson11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ParameterizedTest {

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
    }

    @Test
    public void whenCreateObjectWithGenericsString() {
        assertThat(new Parameterized<String>().addValue("Hello").toString(), is("[Hello, Hello, Hello, Hello, Hello, Hello, Hello, Hello, Hello, Hello]"));
    }

    @Test
    public void whenCreateObjectWithGenericsInteger() {
        assertThat(new Parameterized<Integer>().addValue(10).toString(), is("[10, 10, 10, 10, 10, 10, 10, 10, 10, 10]"));
    }

    @Test
    public void whenCreateObjectWithGenericsDouble() {
        assertThat(new Parameterized<Double>().addValue(10.0).toString(), is("[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]"));
    }

    @Test
    public void whenCreateObjectWithGenericsCat() {
        assertThat(new Parameterized<Cat>().addValue(new Cat("Мурка", 3)).toString(), is("[Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}, Cat{name='Мурка', age=3}]"));
    }
}
