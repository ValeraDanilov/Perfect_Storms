package perfect.storms.lesson10;

public class Person implements Clonable, Serializable {

    private String name;
    private int age;
    private String company;

    public Person() {
    }

    private Person(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String  company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    private String getCompany() {
       return company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                '}';
    }
}

/*
    Answer

    1. What is Class class for? - With the help of it, work with reflection is carried out,
       and it is the entry point into the world of reflection.

    2. What entities in java have a Class? - All objects in Java have a Class.

    3. What are the ways to get a object Class? -  , NameClass.class.

    4. How to get the Class from an object? -getClass().

    5. What is Reflection used for? -Reflection allows you to create new objects, call methods, and get / set
       operations on class variables dynamically at runtime without prior knowledge of its implementation.

    6. What are the disadvantages of Reflection? - Performance decreases, there are security restrictions, risk of disclosing inside information.
 */
