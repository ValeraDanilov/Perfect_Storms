package perfect.storms.lesson3;

public interface Intellectual {

    default void think() {
        System.out.println("Thinks");
    }
}
