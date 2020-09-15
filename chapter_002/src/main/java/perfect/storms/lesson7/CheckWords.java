package perfect.storms.lesson7;

import java.util.Arrays;

public class CheckWords {

    public void searchNumber(String value) {
        String[] number =  value.split("\\D+");
        System.out.println(Arrays.toString(number));
    }

    public void searchNumberFromWords(String value) {
        String[] fields = value.split(" ");
        for (String field : fields) {
            if (field.matches("\\d+")) {
                System.out.println(field);
            }
        }
    }

    public boolean createPassword(String password) {
        boolean result = false;
        if (password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[#@%$])(?=.*[,.!])[A-Za-z0-9.,!#@%$]{6,999999999}$")) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "1Abff.@";
        System.out.println(new CheckWords().createPassword(a));
    }
}

/*
What is aggregation in java? - When one object is part of another. But they can exist without each other.
What is composition in java? - When one object is part of another. But here the lifetime of one object completely depends on the other.
Could you replace one type with another? If so,which one? - You can make a composition out of aggregation. But logic is lost in this.
What is regEx? - These are special sequences of characters that help us modify lines or specify a rule for creating new lines.
Write about ways to create and check a regular expression - You can check the regular expression through Pattern Matcher through string matcher.
 */
