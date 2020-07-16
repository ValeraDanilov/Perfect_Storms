package perfect.storms.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        new DataTypes().typeByte();
        new DataTypes().typeShort();
        new DataTypes().typeInt();
        new DataTypes().typeLong();
        new DataTypes().typeFloatAndDouble();
        new DataTypes().typeChar();
        new DataTypes().allTypes();
        new DataTypes().convert123ToBinary();
        new DataTypes().convert123ToOctal();
        new DataTypes().convert123ToSixteen();
        new DataTypes().primitiveAndReference();
    }

    /**
     * This method contains primitive type byte.
     * It stores a value between -128 and 127. And it takes 1 byte of memory.
     */
    private void typeByte() {
        byte sum = (byte) (255 - 127);
        System.out.println(sum);
    }

    /**
     * This method contains primitive type short.
     * It stores a value between -32768 and 32767. And it takes 2 byte of memory.
     */
    private void typeShort() {
        short sum = (short) (16384 + 16384);
        System.out.println(sum);
    }

    /**
     * This method contains primitive type int.
     * It stores a value between -2147483648  and 2147483647 And it takes 4 byte of memory.
     */
    private void typeInt() {
        int value = 1200;
        System.out.println(value + System.lineSeparator() + Math.round(Math.pow(value, 2)) + System.lineSeparator() + Math.round(Math.pow(value, 3)));
    }

    /**
     * This method contains primitive type long.
     * It stores a value between -9223372036854775808L and 9223372036854775807L. And it takes 8 byte of memory.
     * Used in cases where numbers exceed 2 billion and the standard int is no longer enough.
     */
    private void typeLong() {
        long value = Long.MAX_VALUE;
        System.out.println(value);
    }

    /**
     * This method contains primitive type float and double.
     * float stores a value between ~1,4*10-45 to ~3,4*1038. And it takes 4 byte of memory.
     * double stores a value between ~4,9*10-324 to  ~1,8*10308. And it takes 8 byte of memory.
     */

    private void typeFloatAndDouble() {
        float value = 1245.554F;
        double sum = 256.3785 * value;
        String result = sum + "";
        System.out.println(result.substring(result.lastIndexOf(".") + 1));
    }

    /**
     * This method contains primitive type char.
     * It stores a value between ‘\ u0000’ (or 0) and ‘\ uffff’ (or 65535). And it takes 2 byte of memory.
     */
    private void typeChar() {
        char plusSign = 43;
        System.out.println(plusSign);
        char exclamationMark = 33;
        System.out.println(exclamationMark);
        char questionMark = 63;
        System.out.println(questionMark);

    }

    private void allTypes() {
        int a = 'r';
        char b = 123;
        // float c = 7.2; - у float в конце нужно указывать F
        // short d = 3L; - в конце ставим L только у long
        double e = 0x123D;
        int f = 0x123F;
        // int g = 078;  - в 8-меричной системе счисления нет 8
        short h = 7;
        // byte i = 255; - byte принимает 127 макс значение
        double j = 9;
        // int k = 5.5; - int нельзя присвоить дробное число
        int l = 5;
    }

    private void convert123ToBinary() {
        /**
         * 123 / 2 = 61 (1)
         * 61 / 2 = 30 (1)
         * 30 / 2 = 15 (0)
         * 15 / 2 = 7 (1)
         * 7 / 2 = 3 (1)
         * 3 / 2 = 1 (1)
         * 1 / 2 = 1 (1)
         */
        int value = 0b1111011;
        System.out.println(value);
    }

    private void convert123ToOctal() {
        /**
         * 123 / 8 = 15 (3)
         * 15 / 8 = 1 (7)
         * 1 / 8 = 0 (1)
         */
        int value = 0173;
        System.out.println(value);
    }

    private void convert123ToSixteen() {
        /**
         * 123 / 16 = 7 (11)
         * 7 / 16 = 0 (7)
         */

        int value = 0x7B;
        System.out.println(value);
    }

    /**
     * Отличие примитивных типов от ссылочных учитывая сказанное уже в лекции что примитивы вместе с переменной хранятся в области памяти Stack
     * В то время как у ссылочных там хранится только ссылка.
     * Так же у ссылочных типов есть свои методы, в то время как примитивные можно использоваться только в чужих методах.
     * Классы-обертки, являются дорогостоящими. Например, примитивный тип int (занимает 4 байта) а его обертка Integer (занимает 16 байт) расходы памяти составят 300%
     */
    private void primitiveAndReference() {
        int value = 30;
        Integer age = 30;
        // Ниже приведено пару методов класса Integer

        /**
         * Метод compareTo.
         * Сравнивает два целых числа.
         *      Возвращает:
         * 0 - если они равны
         * -1 - если первое число меньше второго
         * 1  - если 1 число больше второго
         */
        System.out.println(age.compareTo(value));

        /**
         * Метод equals.
         * Сравнивает этот объект с другим объектом.
         *      Возвращает:
         * true - если объекты равны
         * false - если объекты не равны
         */
        System.out.println(age.equals(value));
    }
}
