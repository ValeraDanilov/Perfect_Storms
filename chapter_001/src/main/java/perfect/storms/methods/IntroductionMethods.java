package perfect.storms.methods;

public class IntroductionMethods {
    public static void main(String[] args) {
        new IntroductionMethods().evenAndOddNumbers();
        new IntroductionMethods().sumNumbers(5);
        new IntroductionMethods().divisionByThree(1, 15);
        new IntroductionMethods().triangleImplementation(2, 2, 2);
        System.out.println(new IntroductionMethods().numberMoreNull(1));
        System.out.println(new IntroductionMethods().whenNumberMoreOrSmallerNull(0));
        System.out.println(new IntroductionMethods().outResultTwoMethod(2));
        new IntroductionMethods().multiplicationNumber(10, 6.0);
        new IntroductionMethods().multiplicationNumber(3, 1);
        new IntroductionMethods().multiplicationNumber(4);
        new IntroductionMethods().multiplicationNumber(15.0, 8.0);
        new IntroductionMethods().multiplicationNumber(10, 5, 1, 8, 12, 32);
        System.out.println(System.lineSeparator() + "Twelfth module:");
        new IntroductionMethods().recursion(5);
    }

    private void evenAndOddNumbers() {
        System.out.println("First module:");
        for (int index = 1; index <= 20; index++) {
            if (index % 2 != 0) {
                System.out.print("|" + index);
                if (index < 10) {
                    System.out.print("  | ");
                } else {
                    System.out.print(" | ");
                }
            } else {
                if (index < 10) {
                    System.out.println(index + " |");
                } else {
                    System.out.println(index + "|");
                }
            }
        }
    }

    private void sumNumbers(int number) {
        System.out.println(System.lineSeparator() + "Second module:");
        int sum = 0;
        for (int index = 1; index <= number; index++) {
            sum += index;
        }
        System.out.println(sum);
    }

    private void divisionByThree(int startNumber, int finishNumber) {
        System.out.println(System.lineSeparator() + "Third module:");
        for (int index = startNumber; index <= finishNumber; index++) {
            if (index % 3 == 0) {
                System.out.println(index);
            }
        }
    }

    private void triangleImplementation(int first, int second, int third) {
        System.out.println(System.lineSeparator() + "Fourth module:");
        if (first + second > third && first + third > second && second + third > first) {
            System.out.println("Такой треугольник возможен");
        } else {
            System.out.println("Такой треугольник невозможен");
        }
    }

    private boolean numberMoreNull(int number) {
        System.out.println(System.lineSeparator() + "Fifth module:");
        return number > 0;
    }

    private String whenNumberMoreOrSmallerNull(int result) {
        return numberMoreNull(result) ? "Число больше нуля" : "Число меньше или равно нулю";
    }

    private String outResultTwoMethod(int result) {
        System.out.println(System.lineSeparator() + "Sixth module:");
        return whenNumberMoreOrSmallerNull(result) + " и равно " + result;
    }

    private void multiplicationNumber(int number) {
        System.out.println(System.lineSeparator() + "Seventh module:");
        System.out.println(number * 2);
    }

    private void multiplicationNumber(int number, int value) {
        System.out.println(System.lineSeparator() + "Eighth module:");
        System.out.println(number * value);
    }

    private void multiplicationNumber(int number, double value) {
        System.out.println(System.lineSeparator() + "Ninth module:");
        System.out.println(number * value);
    }

    private void multiplicationNumber(double number, double value) {
        System.out.println(System.lineSeparator() + "Tenth module:");
        System.out.println(number * value);
    }

    private void multiplicationNumber(int... array) {
        System.out.println(System.lineSeparator() + "Eleventh module:");
        int result = 1;
        for (int i = 1; i <= array.length; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    /**
     * Вопросы:
     * <p>
     * Что такое перегрузка метода? -
     * Это возможность использовать методы с одним и тем же именем, но с разными типами и/или количеством параметров.
     * <p>
     * Как перегрузить метод? -
     * Как указал выше создать метод с тем же названием, но использовать другие типы данных в аргументах, или поменять их последовательность.
     * <p>
     * 2-й метод не перезагружен, он не будет работать с первым, так как у них одинаковые аргументы.
     * 3-й метод перезагруженный.
     */
    public static void recursion(int numbers) {
        if (numbers == 0) {
            System.out.println(numbers);
            return;
        }
        if (numbers > 0) {
            numbers--;
            recursion(numbers);
            System.out.println(numbers + 1);
        } else {
            numbers++;
            recursion(numbers);
            System.out.println(numbers - 1);
        }
    }
    /**
     * Рекурсия это метод который вызывает сам себя, он работает как цикл.
     * Неаккуратное использования рекурсии может привести к зацикливанию, после чего программа ляжет с ошибкой StackOverflowError.
     */
}
