package perfect.storms.lesson;

import java.util.stream.Stream;

public class Main {
    private String name;
    private String profession;
    {
        name = "Hello! My name is Valera. ";
        profession = "I want to be a java developer!";
    }
    public void out() {
        Stream.generate(() -> name).limit(5).forEach(System.out::print);
        System.out.println(System.lineSeparator());
        Stream.generate(() -> profession).limit(5).forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Main().out();
    }
}
