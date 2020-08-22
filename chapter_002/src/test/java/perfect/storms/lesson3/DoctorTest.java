package perfect.storms.lesson3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DoctorTest {

    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private Doctor doctor;

    @Before
    public void setUp() {
        System.out.println("Before method");
        System.setOut(new PrintStream(this.mem));
        doctor = new Doctor("Parker", 34);
    }

    @After
    public void tearDown() {
        System.setOut(this.out);
        doctor = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateFirstDoctorSpeak() {
        doctor.speak();
        assertThat(mem.toString(), is(String.format("Hi, my name is Parker. I'm 34 years old.%n")));
    }

    @Test
    public void whenCreateFirstDoctorHeal() {
        doctor.heal();
        assertThat(mem.toString(), is(String.format("Heals%n")));
    }

    @Test
    public void whenCreateFirstDoctorThink() {
        doctor.think();
        assertThat(mem.toString(), is(String.format("Thinks%n")));
    }

    @Test
    public void whenCreateFirstDoctorWorkInfo() {
        doctor.workInfo();
        assertThat(mem.toString(), is(""));
    }

    @Test
    public void whenCreateFirstDoctorGetName() {
        assertThat(doctor.getName(), is("Parker"));
    }

    @Test
    public void whenCreateFirstDoctorGetAge() {
        assertThat(doctor.getAge(), is(34));
    }
}
