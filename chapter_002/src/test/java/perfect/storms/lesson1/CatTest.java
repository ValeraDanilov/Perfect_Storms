package perfect.storms.lesson1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CatTest {

    Cat cat;

    @Before
    public void before() {
        cat = new Cat();
        System.out.println("Before method");
    }

    @After
    public void after() {
        cat = null;
        System.out.println("After method");
    }

    @Test
    public void whenCatSiamese() {
       cat = new Cat("Васька", 1, Breed.SIAMESE, new Person("Антон", 23));
       assertThat(new Cat("Васька", 1, Breed.SIAMESE, new Person("Антон", 23)).toString(), is(cat.toString()));
    }

    @Test
    public void whenCatNebelung() {
        cat = new Cat("Костик", 49, Breed.NEBELUNG, new Person("Ира", 33));
        assertThat(new Cat("Костик", 49, Breed.NEBELUNG, new Person("Ира", 33)).toString(), is(cat.toString()));
    }

    @Test
    public void whenCatBirman() {
        cat = new Cat("Мурзик", 5, Breed.BIRMAN, new Person("Вадим", 25));
        assertThat(new Cat("Мурзик", 5, Breed.BIRMAN, new Person("Вадим", 25)).toString(), is(cat.toString()));
    }
}