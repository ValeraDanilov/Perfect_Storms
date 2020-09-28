package perfect.storms.lesson11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InheritedTypeTest {

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After method");
    }

    @Test
    public void whenCreateObjectExtendsNumber() {
        InheritedType<Integer> number = new InheritedType<>(5);
        number.add(10);
        assertThat(number.get(0), is(10));
    }

    @Test
    public void whenArrayMinIndex() {
            InheritedType<Integer> number = new InheritedType<>(5);
            number.add(10);
            assertNull(number.get(10));
    }

    @Test
    public void whenIndexMinNull() {
        InheritedType<Integer> number = new InheritedType<>(5);
        number.add(1);
        assertNull(number.get(-1));
    }

    @Test
    public void whenAddSuperObject() {
        InheritedType<Integer> number = new InheritedType<>(5);
        number.list.add(new SuperType(10));
        number.list.add(new TypeChild(10, "Alex"));
        assertThat(number.getList().toString(), is("[SuperType{age=10}, TypeChild{name='Alex'}]"));
    }
}