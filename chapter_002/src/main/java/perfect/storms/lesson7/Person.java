package perfect.storms.lesson7;

public class Person {

    private String name;
    private int age;
    private Heart heart;
    private Costume costume;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        heart = new Heart(300, 1);
    }

    public Person(String name, int age, Costume costume) {
        this.name = name;
        this.age = age;
        this.heart = new Heart(300, 1);
        this.costume = costume;
    }

    public String getName() {
        return name;
    }

    public Costume getCostume() {
        return costume;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heart=" + heart +
                ", costume=" + costume +
                '}';
    }
}
