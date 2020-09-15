package perfect.storms.lesson7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PersonTest {

    private Person man;
    private Person woman;

    @Before
    public void setUp() {
        System.out.println("Before method");
        man = new Person("Alex", 18);
        woman = new Person("Dina", 18, new Costume(32, "Red"));
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        man = null;
        woman = null;
    }

    @Test
    public void whenCreateObjectPersonMan() {
        assertThat(man.toString(), is(new Person("Alex", 18).toString()));
    }

    @Test
    public void whenCreateObjectPersonWoman() {
        assertThat(woman.toString(), is(new Person("Dina", 18, new Costume(32, "Red")).toString()));
    }

    @Test
    public void whenCheckGetAge() {
        assertThat(man.getAge(), is(18));
    }

    @Test
    public void whenCheckSetAge() {
        man.setAge(19);
        assertThat(man.getAge(), is(19));
    }

    @Test
    public void whenCheckGetName() {
        assertThat(man.getName(), is("Alex"));
    }

    @Test
    public void whenCheckSetName() {
        man.setName("Misha");
        assertThat(man.getName(), is("Misha"));
    }

    @Test
    public void whenCheckGetHeart() {
        assertThat(man.getHeart().toString(), is(new Heart(300, 1).toString()));
    }

    @Test
    public void whenCheckSetHeart() {
        man.setHeart(new Heart(400, 1));
        assertThat(man.getHeart().toString(), is(new Heart(400, 1).toString()));
    }

    @Test
    public void whenCheckGetCostume() {
        assertThat(woman.getCostume().toString(), is(new Costume(32, "Red").toString()));
    }

    @Test
    public void whenCheckSetCostume() {
        woman.setCostume(new Costume(32, "Orange"));
        assertThat(woman.getCostume().toString(), is(new Costume(32, "Orange").toString()));
    }
}
