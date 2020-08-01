package perfect.storms.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        new Loops().squareOneToTen();
        new Loops().squareNumberInput();
        new Loops().multiplicationElementArray();
        new Loops().figure();
        new Loops().sumNumber();
        new Loops().repeatingNumbers();
        new Loops().numbersCountry();
    }

    private void squareOneToTen() {
        System.out.println("First module:");
        for (int index = 10; index <= 20; index++) {
            System.out.println(index * index);
        }
    }

    private void squareNumberInput() throws IOException {
        System.out.println(System.lineSeparator() + "Second module:");
        System.out.println("Введите число:");
        int number = Integer.parseInt(reader.readLine());
        int count = 1;
        int result;
        while (true) {
            result = count * count;
            if (result >= number) {
                break;
            }
            System.out.println("Квадрат числа: " + count + " равен: " + result);
            count++;
        }
    }

    private void multiplicationElementArray() {
        System.out.println(System.lineSeparator() + "Third module:");
        int[] array = {10, 20, 15, 17, 24, 35};
        int mul = 1;
        for (int value : array) {
            mul *= value;
        }
        System.out.println("Сумма множителя массива равна: " + mul);
    }

    private void figure() throws IOException {
        System.out.println(System.lineSeparator() + "Fourth module:");
        System.out.println("Введите любое положительное число, для формирования фигуры");
        int number = Integer.parseInt(reader.readLine());
        while (number <= 0) {
            System.out.println("Вы ввели число меньше одного, попробуйте снова");
            number = Integer.parseInt(reader.readLine());
        }
        for (int index = 1; index <= number; index++) {
            for (int i = 0; i < number - index; i++) {
                System.out.print(" ");
            }
            for (int count = 0; count < index * 2 - 1; count++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void sumNumber() throws IOException {
        System.out.println(System.lineSeparator() + "Fifth module:");
        System.out.println("Введите числа что бы получить их сумму." + System.lineSeparator() + "Что бы получить результат введите: 0.");
        int result = 0;
        while (true) {
            int sum = Integer.parseInt(reader.readLine());
            result += sum;
            if (sum == 0) {
                System.out.println("Сумма всех введенных чисел равно: " + result);
                break;
            }

        }
    }

    private void repeatingNumbers() throws IOException {
        System.out.println(System.lineSeparator() + "Sixth module:");
        System.out.println("Введите число:");
        String value = reader.readLine();
        int number = Integer.parseInt(value);
        int count = number < 0 ? value.length() - 1 : value.length();
        int element;
        int meaning;
        int result;
        int convert = conversion(number);
        for (int index = 0; index < count; index++) {
            result = convert / 10;
            meaning = convert % 10;
            for (int i = 0; i < count; i++) {
                element = result % 10;
                if (element == meaning) {
                    System.out.println("Да");
                    return;
                }
                result /= 10;
            }
            convert /= 10;
        }
        System.out.println("Нет");
    }

    private int conversion(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }
    
    private void numbersCountry() {
        int xyz = 10000000;
        double growth = 0.014;
        double mortality = 0.008;
        for (int i = 0; i < 10; i++) {
            xyz += (xyz * growth) - (xyz * mortality);
        }
        System.out.println("Население через 10 лет будет: " + (xyz));
    }
}

