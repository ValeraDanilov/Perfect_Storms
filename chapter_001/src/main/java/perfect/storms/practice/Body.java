package perfect.storms.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Body {

    private String[] contacts = new String[1];
    private int size;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    {
        this.contacts[this.size++] = "first name: SOS | last name: - | phone number: 112 | company: -";
    }

    /**
     * Метод add в начале вызывает метод checkArray который проверяет не заполненный ли массив,
     * если свободных ячеек не осталось, то увеличивает его на + 10.
     * После чего проверяет есть ли такое значение в массиве, если есть он не добавит его.
     *
     * @param contact - Добавляет данное значение в массив contacts.
     *                Вызывается методом addContacts.
     */
    public void add(String contact) {
        checkArray(this.contacts, this.size);
        for (int index = 0; index < this.size; index++) {
            if (this.contacts[index].equals(contact)) {
                System.out.println("This contact is already on the list");
                return;
            }
        }
        if (contact.equals("first name: - | last name: - | phone number: - | company: -")) {
            return;
        }
        System.out.println("Contact is added");
        this.contacts[this.size++] = contact;
    }


    /**
     * @param check    - Принимает массив и проверяет, не заполненный ли он.
     * @param position - Принимает счетчик заполненных индексов массива contacts.
     *                 Если длинна массива check равна переменной position то массив копирует свои значение в новый массив добавляя + 10 ячеек.
     *                 Вызывается методом add.
     */
    private void checkArray(String[] check, int position) {
        if (check.length == position) {
            this.contacts = Arrays.copyOf(check, this.size + 10);
        }
    }

    /**
     * @param value - Метод принимает значение и проверяет есть ли оно в массиве.
     * @return - Возвращает индекс переданного значение в метод и возвращает его значение, или  -1.
     * Вызывается в таких методах как delete и replace.
     */
    private int indexOf(String value) {
        int result = -1;
        for (int index = 0; index < this.size; index++) {
            if (this.contacts[index].equals(value)) {
                result = index;
            }
        }
        return result;
    }

    /**
     * @param value - Принимает значение для сравнения равняется ли она числом.
     * @param count - Принимает размер массива в котором находится переданное значение value.
     * @return Возвращает true если такое число есть и false если нет.
     */
    public boolean checkReader(String value, int count) {
        boolean result = false;
        for (int i = 0; i <= count; i++) {
            if (value.equals(i + "")) {
                result = true;
                break;
            }
        }
        System.out.println("There is no contact under this index");
        return result;
    }

    /**
     * @param value - Принимает значение и вызвав метод checkValue проверяет ввёл ли пользователь пробел или нажал просто ENTER.
     * @param index - Передает индекс и выводит одно из сообщений используется только при добавлении нового контакта.
     * @return - Присвоит "-" переменной value Если пользователь ввел пробел или нажал ENTER и возвращает его.
     * Данный метод вызывается в таких методах как addContacts и editContact.
     */
    public String addValue(String value, int index) throws IOException {
        switch (index) {
            case 1:
                System.out.println("Type contact's last name or press \"ENTER\" if you want to skip this step");
                break;
            case 2:
                System.out.println("Type contact's phone number or press \"ENTER\" if you want to skip this step");
                break;
            case 3:
                System.out.println("Type contact's company or press \"ENTER\" if you want to skip this step");
                value = checkNumber(value);
                break;
            default:
        }
        if (editValue(value, 0).length() == 0 || value.equals("")) {
            value = "-";
        }
        return value;
    }

    /**
     * @param number - Принимает значение и проверяет что в нем только цифры.
     *               Если есть буквы то Вас попросит ввести новое значение.
     * @return - Возвращает номер телефона.
     * Вызывается методом addValue.
     */
    private String checkNumber(String number) throws IOException {
        int value = 0;
        boolean result = false;
        while (value < number.length()) {
            int count = 0;
            String element = number.charAt(value) + "";
            while (count < 10) {
                if (element.equals(count + "") || number.split("")[0].equals("+")) {
                    result = true;
                    break;
                }
                count++;
            }
            if (!result) {
                System.out.println("Characters and numbers are not allowed to be entered, please try again.");
                number = this.reader.readLine();
                value = 0;
                if (number.length() == 0) {
                    return number;
                }
            } else {
                result = false;
                value++;
            }
        }
        return number;
    }

    /**
     * @param value - Принимает значение которое нужно отрезать по пробелам и возвращает переданный индекс отрезанного слова.
     * @param index - Принимает значение и возвращает слово под данным индексом.
     *              Данный метод вызывается в методе editContact.
     */
    public String editValue(String value, int index) {
        return value.split(" ")[index];
    }

    /**
     * @param array - Принимает массив и проверяет, что его длина не равняется нулю.
     * @return - Возвращает false если равна и true если нет.
     * Метод вызывается в таких метод как findByNameContact. findByAllContacts. deleteContact. replaceContact. findByName.
     */
    public boolean checkOnNull(String[] array) {
        boolean result = false;
        if (array.length != 0) {
            result = true;
        }
        return result;
    }

    /**
     * @param contact - Принимает значение и ищет его в массиве.
     * @return - Возвращает массив где присутствует значение contact.
     * Метод переводит каждый элемент массива в нижний регистр.
     * После чего разрезает каждый элемент по пробелу и сравнивает с переданным в метод аргументом, и если они одинаковые записывает его в новый массив.
     * Метод вызывается в таких методах как findByNameContact. deleteContact. replaceContact.
     */
    public String[] findByName(String contact) {
        String[] array = new String[this.size];
        int count = 0;
        if (checkOnNull(array)) {
            for (int index = 0; index < array.length; index++) {
                String name = this.contacts[index];
                String value = name.toLowerCase();
                if (editValue(value, 2).equals(contact.toLowerCase()) || editValue(value, 6).equals(contact.toLowerCase()) || editValue(value, 13).equals(contact.toLowerCase())) {
                    array[count++] = name;
                }
            }
        }
        array = Arrays.copyOf(array, count);
        return array;
    }

    public String[] showTheSameValue(String contact) {
        String[] array = findByName(contact);
        if (checkOnNull(array)) {
            for (int index = 0; index < array.length; index++) {
                System.out.println(index + ". " + array[index]);
            }
        } else {
            System.out.println("Contact is not found");
            return null;
        }
        return array;
    }

    /**
     * @return -  Метод возвращает массив только заполненных индексов.
     * Метод Вызывается в таком методе как findByAllContacts.
     */
    public String[] findByAll() {
        return Arrays.copyOf(this.contacts, this.size);
    }

    /**
     * @param value - Принимает значение.
     * @return - Возвращает true если значение удалено и false если нет.
     * Метод принимает значение после чего вызывает метод indexOf который в свою очередь проверяет есть ли такой элемент в массиве.
     * Если есть то возвращает его индекс после чего массив копирует все следующие элементы массива на 1 индекс влево
     * и переданный элемент в аргументе метода затирается.
     * После чего последний элемент массива обнуляется что бы не было дубликата, и переменная size уменьшается на -1.
     * Метод вызывается таким методом как deleteContact.
     */
    public boolean delete(String value) {
        boolean result = false;
        int index = indexOf(value);
        if (index != -1) {
            System.arraycopy(this.contacts, index + 1, this.contacts, index, this.size - index);
            this.contacts[this.size - 1] = null;
            this.size--;
            result = true;
        }
        return result;
    }

    /**
     * @param value   - Принимает значение которое нужно заменить.
     * @param contact - Принимает новое значение на которое нужно заменить.
     * @return - Возвращает true если значение изменено и false если нет.
     * Метод принимает значение которое нужно изменить и проверяет, если ли оно в массиве вызвав метод indexOf.
     * Если такое значение есть то метод indexOf возвращает его индекс после чего на его место в массиве ставится новый переданный элемент.
     * Метод вызывается в таком методе как replaceContact.
     */
    public boolean replace(String value, String contact) {
        boolean result = false;
        int index = indexOf(value);
        if (index != -1) {
            this.contacts[index] = contact;
            result = true;
        }
        return result;
    }
}
