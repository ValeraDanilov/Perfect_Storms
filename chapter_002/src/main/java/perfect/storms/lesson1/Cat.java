package perfect.storms.lesson1;

public class Cat {

    String name;
    int age;
    Breed breed;
    Person owner;

    public Cat() {
    }

    public Cat(String name, int age, Breed breed, Person owner) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                ", owner=" + owner +
                '}';
    }
}
