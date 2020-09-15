package perfect.storms.lesson7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckWordsTest {

    private PrintStream out = System.out;
    private ByteArrayOutputStream mem =  new ByteArrayOutputStream();
    private CheckWords checkWords;
    private String value = "12 var3 34 2% ^ i 90";

    @Before
    public void setUp() {
        System.out.println("Before method");
        checkWords = new CheckWords();
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        checkWords = null;
        System.setOut(this.out);
    }

    @Test
    public void whenPrintNumber() {
        checkWords.searchNumber(value);
        assertThat(mem.toString(), is(String.format("[12, 3, 34, 2, 90]%n")));
    }

    @Test
    public void whenPrintOnlyNumber() {
        checkWords.searchNumberFromWords(value);
        assertThat(mem.toString(), is(String.format("12%n34%n90%n")));
    }

    @Test
    public void whenCreatePasswordTrue() {
        String value = "A1aa@,1";
        assertTrue(checkWords.createPassword(value));
    }

    @Test
    public void whenCreatePasswordFalse() {
        String value = "A1aaj1";
        assertFalse(checkWords.createPassword(value));
    }
}
