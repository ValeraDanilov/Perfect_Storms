package perfect.storms.lesson3;

public interface Strongman {

    default void drag() {
        System.out.println("Drags");
    }
}
