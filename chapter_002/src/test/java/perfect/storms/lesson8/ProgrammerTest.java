package perfect.storms.lesson8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.theInstance;
import static org.junit.Assert.*;

public class ProgrammerTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private Programmer programmer;
    private Programmer.Stack stack;
    private Programmer.Stack newStack;

    @Before
    public void setUp() {
        System.out.println("Before method");
        this.stack = new Programmer.Stack(new String[]{"Java", "Spring", "Kotlin", "Postgresql", "Conspiracy theory"});
        this.newStack = new Programmer.Stack(new String[]{"Java", "Spring"});
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        this.programmer = null;
        this.stack = null;
        this.newStack = null;
        System.setOut(this.out);
    }

    @Test
    public void whenReturnIsAbsent() {
        this.programmer = new Programmer("Tomas", 6);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 6 years old.%nApproximate work experience 0 years%n")));
        assertThat(this.programmer.analysis(this.stack), is("Threat level: Is absent"));
    }

    @Test
    public void whenReturnIsAbsentNull() {
        this.programmer = new Programmer("Tomas", 6);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 6 years old.%nApproximate work experience 0 years%n")));
        assertThat(this.programmer.analysis(this.newStack), is("Threat level: Is absent"));
    }

    @Test
    public void whenReturnWeak() {
        this.programmer = new Programmer("Tomas", 24);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 24 years old.%nApproximate work experience 2 years%n")));
        assertThat(this.programmer.analysis(this.stack), is("Threat level: Weak"));
    }

    @Test
    public void whenReturnWeakNull() {
        this.programmer = new Programmer("Tomas", 24);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 24 years old.%nApproximate work experience 2 years%n")));
        assertThat(this.programmer.analysis(this.newStack), is("Threat level: Is absent"));
    }

    @Test
    public void whenReturnSeriousEstablishSurveillance() {
        this.programmer = new Programmer("Tomas", 30);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 30 years old.%nApproximate work experience 5 years%n")));
        assertThat(this.programmer.analysis(this.stack), is("Threat level: Serious, establish surveillance!"));
    }

    @Test
    public void whenReturnSeriousEstablishSurveillanceNull() {
        this.programmer = new Programmer("Tomas", 30);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 30 years old.%nApproximate work experience 5 years%n")));
        assertThat(this.programmer.analysis(this.newStack), is("Threat level: Is absent"));
    }

    @Test
    public void whenReturnDangerousSendSmithToHim() {
        this.programmer = new Programmer("Tomas", 40);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 40 years old.%nApproximate work experience 10 years%n")));
        assertThat(this.programmer.analysis(this.stack), is("Threat level: Dangerous, send Smith to him!"));
    }

    @Test
    public void whenReturnDangerousSendSmithToHimNull() {
        this.programmer = new Programmer("Tomas", 40);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 40 years old.%nApproximate work experience 10 years%n")));
        assertThat(this.programmer.analysis(this.newStack), is("Threat level: Is absent"));
    }

    @Test
    public void whenReturnHeIsTheChosenOne() {
        this.programmer = new Programmer("Tomas", 70);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 70 years old.%nApproximate work experience 25 years%n")));
        assertThat(this.programmer.analysis(this.stack), is("Threat level: He is the chosen one..."));
    }

    @Test
    public void whenReturnHeIsTheChosenOneNull() {
        this.programmer = new Programmer("Tomas", 70);
        assertThat(mem.toString(), is(String.format("In the matrix there is a new programmer named Tomas, he is 70 years old.%nApproximate work experience 25 years%n")));
        assertThat(this.programmer.analysis(this.newStack), is("Threat level: Is absent"));
    }

    @Test
    public void whenReturnGetNameAndAge() {
        this.programmer = new Programmer("Tomas", 70);
        assertThat(this.programmer.getAge(), is(70));
        assertThat(this.programmer.getName(), is("Tomas"));
    }
}
