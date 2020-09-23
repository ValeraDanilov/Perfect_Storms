package perfect.storms.lesson10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PersonTest {

    private Person person;
    private Class personClass;
    private Field field;

    @Before
    public void setUp() {
        System.out.println("Before method");
        this.person = new Person();
        this.personClass = person.getClass();
    }

    @After
    public void tearDown() {
        System.out.println("After method");
        this.person = null;
        this.personClass = null;
        this.field = null;
    }

    @Test
    public void whenAddPersonName() throws Exception {
        this.person.setName("Alex");
        this.field = personClass.getDeclaredField("name");
        this.field.setAccessible(true);
        assertThat(this.field.get(person), is("Alex"));
    }

    @Test
    public void whenAddPersonAge() throws Exception {
        this.field = personClass.getDeclaredField("age");
        this.field.setAccessible(true);
        this.field.set(this.person, 20);
        assertThat(this.field.get(person), is(20));
    }

    @Test
    public void whenAddPersonCompany() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this.person.setCompany("AMD");
        Method method = personClass.getDeclaredMethod("getCompany");
        method.setAccessible(true);
        assertThat(method.invoke(person), is("AMD"));
    }

    @Test
    public void whenPrintAllFields() {
       Field[] fields = personClass.getDeclaredFields();
       assertThat(Arrays.toString(fields), is("[private java.lang.String perfect.storms.lesson10.Person.name, private int perfect.storms.lesson10.Person.age, private java.lang.String perfect.storms.lesson10.Person.company]"));
    }

    @Test
    public void whenPrintAllPublicMethods() {
        Method[] methods = personClass.getMethods();
        assertThat(Arrays.toString(methods), is(Arrays.toString(methods)));
    }

    @Test
    public void whenPrintAllMethods() {
        Method[] methods = personClass.getDeclaredMethods();
        assertThat(Arrays.toString(methods), is(Arrays.toString(methods)));
    }

    @Test
    public void whenCreateObject() throws Exception {
        Constructor constructor = this.personClass.getDeclaredConstructor(String.class, int.class, String.class);
        constructor.setAccessible(true);
        assertThat(constructor.newInstance("Alex", 20, "AMD").toString(), is("Person{name='Alex', age=20, company='AMD'}"));
    }

    @Test
    public void whenCheckGetAge() throws Exception {
        Constructor constructor = this.personClass.getDeclaredConstructor(String.class, int.class, String.class);
        constructor.setAccessible(true);
        this.person = (Person) constructor.newInstance("Alex", 20, "AMD");
        assertThat(this.person.getAge(), is(20));
    }

    @Test
    public void whenCheckModifierClass() {
        int result = this.personClass.getModifiers();
        assertTrue(Modifier.isPublic(result));
        assertFalse(Modifier.isStatic(result));
        assertFalse(Modifier.isInterface(result));
    }
}
