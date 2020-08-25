package perfect.storms.lesson4;

public class Lion {

    private String name;
    private int age;
    static int count = 0;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int returnCountObjects() {
        return count;
    }

    public Lion newNameLion(Lion lion, String name) {
        lion.name = name;
        return lion;
    }
}

/*
    Ответы на 4-6 задание.
    4-е - Выведет 5.6.
    В меине при вызове метода abc мы в начале передаем переменную j,
    а потом только её увеличиваем на +1.

    5-е задание Ошибка компиляции.
    Мы пытаемся вызвать переменную блоке "else" из блока "if",
    else - не видит переменные из блока "if" что бы он увидил её нужно перести в тело метода average().

    6-е задание тут будет 2, 5, 6, 3, 4, 7, 1.
    В начале выводит статические поля 2. 5. 6.
    Потом Идет создания объекта в маин и инициализация и вывод не статических полей 3, 4, 7.
    И в конце сработает конструктор с 1.
 */
