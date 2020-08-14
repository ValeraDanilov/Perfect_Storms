package perfect.storms.lesson1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PersonTest {

    Person[] people = new Person[5];
    {
      people[0] = new Person("Gannibal", 85);
      people[1] = new Person("Van Helsing", 17);
      people[2] = new Person("Deckart Cain", 33);
      people[3] = new Person("Altair", 25);
      people[4] = new Person("Sam", 36);
    }

    @Before
    public void before() {
        System.out.println("Before method");
    }

    @After
    public void after() {
        System.out.println("After method");
    }

    @Test
    public void whenPersonEqualsNameAndAge() {
        Person person = new Person("Adam", 23);
        assertThat(person.toString(), is(new Person("Adam", 23).toString()));
    }

    @Test
    public void whenSortPersonToAge() {
         assertThat(Arrays.toString(new SortPerson().sortByAge(people)), is("[Person{name='Van Helsing', age=17}," +
            " Person{name='Altair', age=25}," +
            " Person{name='Deckart Cain', age=33}," +
            " Person{name='Sam', age=36}," +
            " Person{name='Gannibal', age=85}]"));
    }

    @Test
    public void whenSortPersonToName() {
         assertThat(Arrays.toString(new SortPerson().sortByName(people)), is("[Person{name='Altair', age=25}," +
             " Person{name='Deckart Cain', age=33}," +
             " Person{name='Gannibal', age=85}," +
             " Person{name='Sam', age=36}," +
             " Person{name='Van Helsing', age=17}]"));
    }

    @Test
    public void whenReturnDateOfCreation() {
        Person person = new Person("Джон Картер", 30);
        String value = new SortPerson().meditaion(person);
        assertThat(new SortPerson().meditaion(person), is(value));
    }
}