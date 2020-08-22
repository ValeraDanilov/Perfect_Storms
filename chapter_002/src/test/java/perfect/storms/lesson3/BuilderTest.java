package perfect.storms.lesson3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BuilderTest {

    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private Builder builder;

    @Before
    public void setUp() {
        System.out.println("Before method");
        System.setOut(new PrintStream(this.mem));
        builder = new Builder("Petr", 56);
    }

    @After
    public void tearDown() {
        System.setOut(this.out);
        builder = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateFirstDoctorSpeak() {
        builder.speak();
        assertThat(mem.toString(), is(String.format("Hi, my name is Petr. I'm 56 years old.%n")));
    }

    @Test
    public void whenCreateFirstDoctorHeal() {
        builder.build();
        assertThat(mem.toString(), is(String.format("Builds%n")));
    }

    @Test
    public void whenCreateFirstDoctorThink() {
        builder.drag();
        assertThat(mem.toString(), is(String.format("Drags%n")));
    }

    @Test
    public void whenCreateFirstDoctorWorkInfo() {
        builder.workInfo();
        assertThat(mem.toString(), is(""));
    }

    @Test
    public void whenCreateFirstDoctorGetName() {
        assertThat(builder.getName(), is("Petr"));
    }

    @Test
    public void whenCreateFirstDoctorGetAge() {
        assertThat(builder.getAge(), is(56));
    }
}
