package perfect.storms.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContactList {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param body - Принимает значение для дальнейшего его добавления.
     *             Вызывает метод add передает в него строку и вызываем метод addValue в который передаем ввод с клавиатуры.
     *             Если мы введем пробел или просто нажмём ENTER  то метод автоматически присвоит "-".
     */
    public static void addContacts(Body body) throws IOException {
        System.out.println("Type contact details to add" + System.lineSeparator());
        System.out.println("Type contact's first name or press \"ENTER\" if you want to skip this step");
        body.add("first name: " + body.addValue(reader.readLine(), 1) + " | last name: " + body.addValue(reader.readLine(), 2)
        + " | phone number: " + body.addValue(reader.readLine(), 3) + " | company: " + body.addValue(reader.readLine(), 0));
    }

    /**
     * @param contact - Принимает значение для дальнейшего его изменения.
     * @return - Возвращает изменённое значение.
     * Метод имеет начальные значения resultName resultSurname resultPhoneNumber resultCompany.
     * Если значения какой-то из этих перемен мы не изменили то они остаются такими же.
     * Дальше запускается цикл и выводится метод menuEdit с перечисленными возможностями метода.
     * В цикле мы выбираем значение кейса и после, его срезает по выбранному вами выше значению.
     * Дальше в параметре метода replace вызывается метод editValue который вернет нам значение которое мы хотим сменить.
     * И дальше вызывается метод addValue в котором мы вводим новое значение, если мы введем пробел или просто ENTER.
     * То значение стандартно присвоится "-".
     * Метод вызывает методы editValue. menuEdit. addValue.
     */
    private static String editContact(String contact) throws IOException {
        String resultName = new Body().editValue(contact, 2);
        String resultSurname = new Body().editValue(contact, 6);
        String resultPhoneNumber = new Body().editValue(contact, 10);
        String resultCompany = new Body().editValue(contact, 13);
        boolean run = true;
        while (run) {
            editMenu();
            String index = reader.readLine();
            switch (index) {
                case "1":
                    System.out.println("Type first name");
                    resultName = contact.split(" ")[2].replace(new Body().editValue(contact, 2), new Body().addValue(reader.readLine(), 0));
                    break;
                case "2":
                    System.out.println("Type last name");
                    resultSurname = contact.split(" ")[6].
                            replace(new Body().editValue(contact, 6),
                                    new Body().addValue(reader.readLine(), 0));
                    break;
                case "3":
                    System.out.println("Type phone number");
                    resultPhoneNumber = contact.split(" ")[10].
                            replace(new Body().editValue(contact, 10),
                                    new Body().addValue(reader.readLine(), 0));
                    break;
                case "4":
                    System.out.println("Type company");
                    resultCompany = contact.split(" ")[13].
                            replace(new Body().editValue(contact, 13),
                                    new Body().addValue(reader.readLine(), 0));
                    break;
                case "5":
                    run = false;
                    break;
                default:
                    System.out.println("This index is not in the list");
            }
        }
        return "first name: " + resultName + " | last name: " + resultSurname + " | phone number: " + resultPhoneNumber + " | company: " + resultCompany;
    }

    /**
     * @param body - Принимает объект класса Body.
     *             Вызывает метод findByName и просит Вас ввести имя, фамилию, или роль контакта.
     *             Если такой контакт есть в списке, его выведет на экран.
     *             Метод вызывает метод checkOnNull.
     */
    public static void findByNameContact(Body body) throws IOException {
        System.out.println("Type the contact's first name, last name or company");
        String[] contact = body.findByName(reader.readLine());
        if (body.checkOnNull(contact)) {
            for (String name : contact) {
                System.out.println(name);
            }
        } else {
            System.out.println("Contact is not found");
        }
    }

    /**
     * @param body - Принимает объект класса Body.
     *             Дальше вызывает метод findByAll, после чего сортирует его и проверяет, если массив не пустой то выводит его на экран.
     *             Метод принимает метод findByAll.
     */
    public static void findByAllContacts(Body body) {
        String[] contact = body.findByAll();
        Arrays.sort(contact);
        if (body.checkOnNull(contact)) {
            for (String element : contact) {
                System.out.println(element);
            }
        } else {
            System.out.println("No contacts found");
        }
    }

    /**
     * @param body - Принимает объект класса Body.
     *             Дальше вызывает метод findByName и просит вас ввести имя фамилию или роль контакта, которого вы хотите удалить.
     *             Дальше проверяет что массив, не пустой и выводит его на экран. Если массив пустой то метод прекратит работу.
     *             Дальше Вас попросит ввести порядковый номер контакта из списка что вывело выше.
     *             После ввода вызовется метод checkReader который проверит что вы ввели правильный порядковый номер.
     *             Если номер совпал то он спарсится в инт значение и проверится не является ли он меньше нуля и больше длинны массива.
     *             После чего вызовется метод delete где элемент будет удалён.
     *             Метод вызывает такие методы как findByName. checkOnNull. checkReader. delete.
     */
    public static void deleteContact(Body body) throws IOException {
        System.out.println("Type the contact's first name, last name or company to delete it");
        String[] array = body.showTheSameValue(reader.readLine());
        if (array.length == 0) {
            return;
        }
        System.out.println("Choose the contact's  ordinal number on the list to delete");
        String index = reader.readLine();
        if (body.checkReader(index, array.length)) {
            int value = Integer.parseInt(index);
            if (value < array.length && value >= 0) {
                boolean result = body.delete(array[value]);
                String contact = result ? "Contact is deleted" : "Contact is not found";
                System.out.println(contact);
            } else {
                System.out.println("There is no contact under this index");
            }
        }
    }

    /**
     * @param body - Принимает объект класса Body.
     *             Дальше вызывает метод findByName и просит вас ввести имя фамилию или роль контакта, которого вы хотите изменить.
     *             Дальше проверяет что массив, не пустой и выводит его на экран. Если массив пустой то метод прекратит работу.
     *             Дальше Вас попросит ввести порядковый номер контакта из списка что вывело выше.
     *             После ввода вызовется метод checkReader который проверит что вы ввели правильный порядковый номер.
     *             Если номер совпал то он спарсится в инт значение и проверится не является ли он меньше нуля и больше длинны массива.
     *             После чего отправит Вас в метод editContact для корректировки параметров контакта.
     *             После корректировки значение передастся в метод replace где будет произведена замена элемента в массиве.
     *             Метод вызывает такие методы как findByName. checkOnNull. checkReader. editContact. replace.
     */
    public static void replaceContact(Body body) throws IOException {
        System.out.println("Type the contact's first name, last name or company to edit it");
        String[] array = body.showTheSameValue(reader.readLine());
        if (array.length == 0) {
            return;
        }
        System.out.println("Choose the contact's  ordinal number on the list to edit");
        String index = reader.readLine();
        if (body.checkReader(index, array.length)) {
            int value = Integer.parseInt(index);
            if (value < array.length && value >= 0) {
                String newValue = ContactList.editContact(array[value]);
                boolean result = body.replace(array[value], newValue);
                String contact = result ? "Contact is edited" : "Contact is not found";
                System.out.println(contact);
            } else {
                System.out.println("There is no contact under this index");
            }
        }
    }

    /**
     * Выводит на экран меню возможностей метода init.
     * Вызывается методом init.
     */
    private void showMenu() {
        System.out.println(System.lineSeparator() + "Menu");
        System.out.println("1. Add new contact");
        System.out.println("2. Show all contacts");
        System.out.println("3. Edit contact");
        System.out.println("4. Delete contact");
        System.out.println("5. Find contact by first name, last name or company");
        System.out.println("6. Exit Program");
    }

    /**
     * Выводит на экран меню возможностей метода editContact.
     * Вызывается методом editContact.
     */
    private static void editMenu() {
        System.out.println("I want to edit");
        System.out.println("1. first name");
        System.out.println("2. last name");
        System.out.println("3. phone number");
        System.out.println("4. company");
        System.out.println("5. exit");
    }

    /**
     * @param body - Принимает объект класса Body.
     *             Метод запускает цикл и вызывает метод showMenu() который в свою очередь выводит список меню программы.
     *             Дальше просит метод ввести вас любой пункт из перечисленного меню, если введете что либо другое Вам выведет сообщение
     *             что такого пункта нет и вводить нужно будет пока не нажмете пункт выйти.
     *             Метод вызывает такие методы как addContacts. findByAllContacts. replaceContact. deleteContact. findByNameContact. showMenu.
     */
    public void init(Body body) throws IOException {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            String select = reader.readLine();
            switch (select) {
                case "1":
                    ContactList.addContacts(body);
                    break;
                case "2":
                    ContactList.findByAllContacts(body);
                    break;
                case "3":
                    ContactList.replaceContact(body);
                    break;
                case "4":
                    ContactList.deleteContact(body);
                    break;
                case "5":
                    ContactList.findByNameContact(body);
                    break;
                case "6":
                    System.out.println("Today is going to be a awesome day for you");
                    run = false;
                    break;
                default:
                    System.out.println("There is no such item in the list");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Body body = new Body();
        new ContactList().init(body);
    }
}
