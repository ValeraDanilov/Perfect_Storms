package perfect.storms.lesson11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DatabaseTest {

    private Database<String, Integer, Character> database;
    private String[] name = {"Alex", "Oleg", "Ira", "Maya"};
    private Integer[] age =  {18, 53, 40, 12};
    private Character[] alphabet = {'a', 'b', 'c', 'd', 'e'};

    @Before
    public void setUp() {
        System.out.println("Before method");
        this.database = new Database<>(this.name, this.age, this.alphabet);
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        this.database = null;
    }

    @Test
    public void whenReturnValueE() {
        assertThat(this.database.printE(2), is("Ira"));
    }

    @Test
    public void whenReturnNotValueE() {
        assertNull(this.database.printE(5));
    }

    @Test
    public void whenReturnMinusValueE() {
        assertNull(this.database.printE(-5));
    }

    @Test
    public void whenReturnValueM() {
        assertThat(this.database.printM(2), is(40));
    }

    @Test
    public void whenReturnNotValueM() {
        assertNull(this.database.printM(5));
    }

    @Test
    public void whenReturnMinusValueM() {
        assertNull(this.database.printM(-5));
    }

    @Test
    public void whenReturnValueT() {
        assertThat(this.database.printT(2), is('c'));
    }

    @Test
    public void whenReturnNotValueT() {
        assertNull(this.database.printT(8));
    }

    @Test
    public void whenReturnMinusValueT() {
        assertNull(this.database.printT(-8));
    }
}

