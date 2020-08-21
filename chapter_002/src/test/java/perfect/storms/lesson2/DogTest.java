package perfect.storms.lesson2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class DogTest {

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        System.out.println("After Method");
    }

    @Test
    public void whenEqualsTwoObjectAndReturnFalse() {
        Dog barsic = new Dog("Barsic");
        Dog rena = new Dog("Rena");
        assertNotEquals(barsic, rena);
    }

    @Test
    public void whenEqualsTwoObjectAndReturnTrue() {
        Dog rena1 = new Dog("Rena");
        Dog rena = new Dog("Rena");
        assertEquals(rena1, rena);
    }

    @Test
    public void whenTwoClassesNotEquals() {
        Dog rena = new Dog("Rena");
        Cat burmilla = new Cat("Барсик", 5, "Burmilla");
        assertThat(rena.getClass(), is(not(burmilla.getClass())));
    }

    @Test
    public void whenTwoClassEquals() {
        Dog rena = new Dog("Rena");
        assertEquals(rena, rena);
    }
}

/*
        Object a = new Integer(100);  // Line1
        Object b = new Long(100);     // Line2
        Object c = new String("100"); // Line3
        a = null;                     // Line4
        a = c;                        // Line5
        c = b;                        // Line6
        b = a;                        // Line7

        Удалится только один объект new Integer(100).
        В строке 9 переменная "а" ссылается на объект String.
        И объект new Integer(100) подлежит утилизации так как больше не одна переменная не ссылается на него.
        Переменные "b" и "c" ссылаются на объекты String и Long в строках 10 и 11, поэтому они утилизированы не будут.
*/
