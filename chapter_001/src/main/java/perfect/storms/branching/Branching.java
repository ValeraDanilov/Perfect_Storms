package perfect.storms.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Branching {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        new Branching().outB6();
        new Branching().outError();
        new Branching().ontMaxAndMin();
        new Branching().out();
        new Branching().outTernary();
        System.out.println("Введите номер месяца: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(new Branching().outNumberOfMonth(number));
        System.out.println("Введите день недели: ");
        String value = reader.readLine();
        System.out.println(new Branching().correction(value));
    }
    //Здесь ничего не выведется, так как b будет равна 6.
    private void outB6() {
        int a = 7;
        int b = --a;
        if (b == 7) {
            System.out.println("b = 7");
        }
    }
    // Этот код не пропустит компилятор, так как if может работать только с boolean логикой;
    private void outError() {
//        int c = 3, d = 2;
//        if (c = d++) {
//            System.out.println("It is 'if' statement!");
//        } else {
//            System.out.println("It is 'else' statement!");
//        }
    }

    private void ontMaxAndMin() {
        int a = 34, b = 2, c = 78;
        if (Math.max(a, b) >= c) {
            System.out.println(Math.max(a, b));
        } else if (c >= Math.max(a, b)) {
            System.out.println(c);
        }
        if (Math.min(a, b) >= c) {
            System.out.println(c);
        } else if (Math.min(a, b) <= c) {
            System.out.println(Math.min(a, b));
        }
    }

    /** Если мы b >= a изменим на b == a;
     * То выведет "All statements are false";
     * Если мы c == 10 изменим на c >= 10;
     * То выведет "One of statements is true.";
     * Если мы c <= b) && (a != b) изменим на c <= b) && (a == b);
     * То выведем "All statements are true.";
     * На данный момент выводит "One of the statements isn't true.";
     */
    private void out() {
        int a = 10;
        int c = a;
        int b = ++a;
        if (b >= a) {
            if (c == 10) {
                if ((c <= b) && (a != b)) {
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }
    }

    private void outTernary() {
        int number = 8;
        String message = number > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
        System.out.println(message);
    }

    private String outNumberOfMonth(int number) {
        switch (number) {
            case 1:
            case 2:
            case 12:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Fall";
            default:
                return "There is no such month";
        }
    }

    private String correction(String day) {
        switch (day) {
            case "monday":
                return  "This is the first day of the week";
            case "tuesday":
                return "This is the second day of the week";
            case "wednesday":
                return "This is the third day of the week";
            case "thursday":
                return "This is the fourth day of the week";
            case "friday":
                return "This is the fifth day of the week";
            case "saturday":
                return "This is the sixth day of the week";
            case "sunday":
                return "This is the seventh day of the week";
            default:
                return "Such day of the week doesn't exist.";
        }
    }
}
