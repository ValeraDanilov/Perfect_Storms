package perfect.storms.lesson1;

import java.util.*;

public class SortPerson {

    public Person[] sortByAge(Person[] people) {
        for (int index = 0; index < people.length; index++) {
            for (int count = index + 1; count < people.length; count++) {
                if (people[index].age > people[count].age) {
                    Person person = people[index];
                    people[index] = people[count];
                    people[count] = person;
                }
            }
        }
        //Arrays.sort(people, Comparator.comparing(person -> person.age));
        return people;
    }

    public Person[] sortByName(Person[] people) {
        for (int index = 0; index < people.length; index++) {
            for (int count = index + 1; count < people.length; count++) {
                if (people[index].name.compareTo(people[count].name) > 0) {
                    Person person = people[index];
                    people[index] = people[count];
                    people[count] = person;
                }
            }
        }
       // Arrays.sort(people, Comparator.comparing(person -> person.name));
        return people;
    }

    public String meditaion(Person person) {
        Calendar timeStamp = Calendar.getInstance();
        return "I think - it means I exist. (" + person.name + ") " + timeStamp.getTime();
    }

    public static void main(String[] args) {
        Person person = new Person("Anno", 22);
        System.out.println(new SortPerson().meditaion(person));
    }
}
