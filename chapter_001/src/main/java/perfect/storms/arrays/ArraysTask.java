package perfect.storms.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysTask {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int indexA, indexB;
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива:");
        int[] value =  new ArraysTask().array(Integer.parseInt(reader.readLine()));
        new ArraysTask().arrayReverse(value);
        System.out.println(System.lineSeparator() + "Введите индексы двух элементов из списка ниже, которые Вы хотите поменять местами:");
        System.out.println(Arrays.toString(value));
        indexA = Integer.parseInt(reader.readLine());
        if (new ArraysTask().check(value, indexA, "indexA ")) {
            indexB = Integer.parseInt(reader.readLine());
            if (new ArraysTask().check(value, indexB, "indexB ")) {
                new ArraysTask().reverseToIndex(value, indexA, indexB);
            }
        }
    }
    private int[] array(int index) throws IOException {
        int[] arrays = new int[index];
        for (int number = 0; number < arrays.length; number++) {
            System.out.println("Введите " + number + " - й элемент массива:");
            arrays[number] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arrays) + System.lineSeparator());
        return arrays;
    }

    private void arrayReverse(int[] arrays) {
        int[] arrayRevers = new int[arrays.length];
        for (int index = 0; index < arrays.length; index++) {
            arrayRevers[index] = arrays[arrays.length - 1 - index];
        }
        System.out.println("Перевернутый массив:" + System.lineSeparator() + Arrays.toString(arrayRevers));
    }

    private void reverseToIndex(int[] arrays, int indexA, int indexB) {
        int index = arrays[indexA];
        arrays[indexA] = arrays[indexB];
        arrays[indexB] = index;
        System.out.println(Arrays.toString(arrays));
    }

    private boolean check(int[] arrays, int index, String name) throws IOException {
        while (true) {
            if (arrays.length - 1 >= index && index >= 0) {
                break;
            } else {
                System.out.println("Попытка обмена: " + name + "(" + index + ") неверны!" + System.lineSeparator() + "Попробуйте снова:");
                if (name.equals("indexA ")) {
                    indexA = Integer.parseInt(reader.readLine());
                    index = indexA;
                } else {
                    indexB = Integer.parseInt(reader.readLine());
                    index = indexB;
                }
            }
        }
        return true;
    }
}
