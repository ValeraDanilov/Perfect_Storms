package perfect.storms.lesson8;

public class Programmer {

    private String name;
    private int age;
    private Experience experience;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("In the matrix there is a new programmer named " + this.name + ", he is " + this.age + " years old.");
        this.experience = new Experience();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Experience getExperience() {
        return experience;
    }

    public String analysis(Programmer.Stack stack) {
         if (getExperience().summary >= 1 && getExperience().summary <= 4 && stack.arrays.length >= 3) {
            return  "Threat level: Weak";
        } else if (getExperience().summary >= 5 && getExperience().summary <= 8 && stack.arrays.length >= 3) {
            return "Threat level: Serious, establish surveillance!";
        } else if (getExperience().summary >= 9 && getExperience().summary <= 12 && stack.arrays.length >= 3) {
            return "Threat level: Dangerous, send Smith to him!";
        } else if (getExperience().summary >= 13 && stack.arrays.length >= 3) {
            return "Threat level: He is the chosen one...";
        }
        return "Threat level: Is absent";
    }

    private class Experience {

        private int summary;

        {
            if ((age - 20) / 2 > 0) {
                this.summary = (age - 20) / 2;
                System.out.println("Approximate work experience " + summary + " years");
            } else {
                System.out.println("Approximate work experience " + 0 + " years");
            }
        }
    }

    public static class Stack {

        private String[] arrays;

        public Stack(String[] arrays) {
            this.arrays = arrays;
        }
    }
}
