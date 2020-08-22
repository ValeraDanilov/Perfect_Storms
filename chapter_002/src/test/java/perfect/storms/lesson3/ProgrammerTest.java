package perfect.storms.lesson3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProgrammerTest {

    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private Programmer programmer;

    @Before
    public void setUp() {
        System.out.println("Before method");
        System.setOut(new PrintStream(this.mem));
        programmer = new Programmer("John Carter", 30);
    }

    @After
    public void tearDown() {
        System.setOut(this.out);
        programmer = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateFirstDoctorSpeak() {
        programmer.speak();
        assertThat(mem.toString(), is(String.format("Hi, my name is John Carter. I'm 30 years old.%n")));
    }

    @Test
    public void whenCreateFirstDoctorHeal() {
        programmer.programming();
        assertThat(mem.toString(), is(String.format("Programming%n")));
    }

    @Test
    public void whenCreateFirstDoctorThink() {
        programmer.think();
        assertThat(mem.toString(), is(String.format("Thinks%n")));
    }

    @Test
    public void whenCreateFirstDoctorWorkInfo() {
        programmer.workInfo();
        assertThat(mem.toString(), is(""));
    }

    @Test
    public void whenCreateFirstDoctorGetName() {
        assertThat(programmer.getName(), is("John Carter"));
    }

    @Test
    public void whenCreateFirstDoctorGetAge() {
        assertThat(programmer.getAge(), is(30));
    }
}
