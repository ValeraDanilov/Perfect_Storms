package perfect.storms.calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Out {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Task one.
    /**
     * String st = "Java"; - Данный объект заносится в pool, который в свою очередь хранится в Heap.
     *--------------------------
     * String st2 = new String("Java"); - Данный объект хранится в Heap. И только если такого значение не будет в pool строк, JVM занесет его туда.
     * --------------------------
     * String st3 = st2.intern(); - Как я понимаю, здесь мы присваиваем значение объекта st2 объекту st3 который хранится в pool.
     * Но так как в pool уже есть значение "Java". новый объект создан не будет, а поместит ссылку на уже существующий объект.
     * --------------------------
     * String st4 = "java"; -  Данный объект так же запишется в pool
     * --------------------------
     * String st = null; - Тут происходит обнуления объекта в pool его нет.
     * --------------------------
     * String st6 = new String("JAVA"); - Данный объект так же хранится в Heap. Так как значения "JAVA" ещё нет в pool строк, JVM занесется и туда.
     */
    public static void main(String[] args) throws IOException {
        new Out().wordReplacement();
        System.out.println("Введите два слова, что бы в каждом было четное количество букв");
        while (true) {
            String element = reader.readLine();
            String name = reader.readLine();
            if (element.length() % 2 == 0 && name.length() % 2 == 0) {
                new Out().concatWords(element, name);
                break;
            }
            System.out.println("Одно из слов содержит не четное количество букв");
        }
        System.out.println("Введите строку и она выведется в обратном порядке:");
        new Out().reverse(reader.readLine());
    }

    //Task two.
    private void wordReplacement() {
        String value = "Лондон - столица Англии".replace("Англии", "Великобритании");
        System.out.println(value);
    }

    //Task three
    private void concatWords(String valueFirst, String valueSecond) {
        StringBuilder stringBuilder = new StringBuilder(valueFirst);
        stringBuilder.delete(valueFirst.length() / 2, valueFirst.length());
        StringBuilder stringBuilder1 = new StringBuilder(valueSecond);
        stringBuilder1.delete(0, valueSecond.length() / 2);
        System.out.println(stringBuilder.append(stringBuilder1));
    }

    //Task four
    private void reverse(String value) {
        StringBuilder stringBuilder = new StringBuilder(value);
        System.out.println(stringBuilder.reverse());
    }
}
