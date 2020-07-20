package perfect.storms.operators;

public class Operators {

    public static void main(String[] args) {
        new Operators().mathOperators();
        new Operators().assignmentOperators();
        new Operators().incrementAndDecrementOperators();
        new Operators().comparisonOperators();
        new Operators().logicalOperators();
        new Operators().bitwiseOperators();
        new Operators().bitShiftOperators();
    }

    private void mathOperators() {
        System.out.println("First module:");
        int a = 10 + 2;
        System.out.println(a);
        int b = a + 5;
        System.out.println(b);
        int c = (b - a) + 1;
        System.out.println(c);
        int d = a * b * c;
        System.out.println(d);
        int e = d / 8;
        System.out.println(e);
        int f = e % 30;
        System.out.println(f);
        int g = -f;
        System.out.println(g);
    }

    private void assignmentOperators() {
        System.out.println(System.lineSeparator() + "Second module:");
        int a = 10;
        System.out.println(a);
        a += 3;
        System.out.println(a);
        a -= 7;
        System.out.println(a);
        a *= 4;
        System.out.println(a);
        a /= 8;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
    }

    /**
     * post-increment - в начале получаем присвоенное число, а потом только увеличиваем число на 1.
     * pre-increment - сразу же присвоенному числу добавляем 1.
     * post-decrement - в начале получаем присвоенное число, а потом только уменьшаем число на 1.
     * pre-decrement - сразу же уменьшаем число на 1.
     */
    private void incrementAndDecrementOperators() {
        System.out.println(System.lineSeparator() + "Third module:");
        int a = 0;
        int b = 5;
        System.out.println(a + " " + b);
        System.out.println(++a);
        System.out.println(--b);
        a = --b;
        // Здесь мы в начале отнимаем 1 затем выводим на экран, здесь будет число 3.
        System.out.println(a);
        a = b--;
        // Здесь мы в начале выводим на экран, а потом отнимаем -1. здесь так же будет число 3.
        System.out.println(a);
        // Что бы получить число 2 из примера выше, мы можем b присвоит новой переменной и вывести на экран.
        int c = b;
        System.out.println(c);
    }

    /**
     * В методе ниже используются операторы сравнения, которые в зависимости от значения выведут true или false
     * В таких случаях тип данных возвращается boolean
     */
    private void comparisonOperators() {
        System.out.println(System.lineSeparator() + "Fourth module:");
        int a = 3;
        int b = 5;
        System.out.println(a > b);
        // Выведет false так как 3 меньше 5
        System.out.println(a >= b);
        // Выведет false так как 3 меньше и не равняется  5
        System.out.println(a == b);
        // Выведет false так как 3 не равняется 5
        System.out.println(a != b);
        // Выведет true так как 3 не равняется  5
        System.out.println(a <= b);
        // Выведет true так как 5  больше 3
        System.out.println(a < b);
        // Выведет true так как 5 больше 3
        a = 5;
        System.out.println(a != b);
        // Выведет false так как проверка идет на то что a не равняется b в то время как они стали равны на 89 строке
    }

    /**
     * ! -  означает “NOT - нет”. Возвращает true если операнд является false. Возвращает false если операнд является true.
     * & - Возвращает true если оба операнда равны true.
     * && - То же самое, что и &, но если операнд, находящийся слева от & является false, данный оператор возвращает false без проверки второго операнда.
     * | - Возвращает true если хотя бы один из операндов равен true.
     * || - То же самое, что и |, но если оператор слева является true, оператор возвращает true без проверки второго операнда.
     * ^ - Возвращает true, если один и только один из операндов равен true. Возвращает false, если оба операнда равны true или false. По сути, возвращает true, если операнды — разные.
     */
    private void logicalOperators() {
        System.out.println(System.lineSeparator() + "Fifth module:");
        boolean bOne = true;
        boolean bTwo = false;
        System.out.println(bOne || bTwo);
        System.out.println(bOne | bTwo);
        System.out.println(bOne && bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(!bOne);
        bTwo = true;
        System.out.println(bOne || bTwo);
        System.out.println(bOne | bTwo);
        System.out.println(bOne && bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(!bOne);
//        a. (true || false) - вернет true.
//        b. (false && true )- вернет false.
//        c. (!true || 1 >= 0) - вернет false.
//        d. (false && 5) - код не верный, мы пытаемся сравнить boolean значение и int.
//        e. (true &&! false) - Выведет true.
//        f. (true ^! true) - выведет true.
//        i. (1> = 1 || false) - выведет true.
//        g. (true && 5 - 5) - код не верным, арифметические операции можно производить только в случае сравнения результат с каким-то числом.
    }

    private void bitwiseOperators() {
        System.out.println(System.lineSeparator() + "Sixth module:");
        int a = 4;
        int b = 3;
        System.out.println(a + " " + b);
        System.out.println(a & b);
        /*
         * 4 и 3 с побитовым оператором & будет равняться 0.
         * Так как  & - Возвращает true если оба операнда равны true.
         * 4 = 100
         * 3 =  11
         *     000
         * Я сравнил что 1 это - true а 0 false.
         * Вот и выходит при сравнении 2 чисел
         * false & true = false;
         * false & true = false;
         * true & false = false;
         */
        System.out.println(a | b);

        /*
         * 4 и 3 с побитовым оператором | будет равняться 7.
         * Так как | - Возвращает true если хотя бы один из операндов равен true.
         * 4 = 100
         * 3 =  11
         *     111
         * false | true = true;
         * false | true = true;
         * true | false = true;
         */
        System.out.println(a ^ b);

        /*
         * 4 будет равно - 5.
         * Так как ~ Переводит число в минус, а точнее меняет все 1 на 0 а 0 на 1.
         * Число 4 в побитовой системе будет 100. Переведя его в отрицательное мы получим 11111111111111111111111111111011.
         * Что бы получить число -4 нам нужно две последних единицы вернуть обратно на 00 а 0 обратно на единицу.
         */
        System.out.println(~a);
    }

    private void bitShiftOperators() {
        System.out.println(System.lineSeparator() + "Seventh module:");
        int a = 10;
        /*
         * a << 1 = 20;
         * В этом коде весь бинарный код сдвигается на 1 позицию влево.
         */
        System.out.println(a << 1);

        /*
         * a >> 1 = 5;
         * В этом коде весь бинарный код сдвигается на 1 позицию в право.
         */
        System.out.println(a >> 1);
        a = -5;

        /*
         * a >>> 1 = 2147483645;
         * В этом коде весь бинарный код сдвигается на 1 позицию в право, а в начале добавляется 0.
         * C положительными числами, он работает идентично, как и оператор >>.
         * Случает с отрицательными числами оператор >>> работает иначе
         * он сдвигает все цифры на 1 позицию в право, а в начале добавляет 0.
         */
        System.out.println(a >>> 1);
    }
}

