package perfect.storms.lesson5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HouseDatabaseTest {

    private Input input;
    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final House[] houses = {new House(13, 48, 12, 14, 3, "Working", "office", 56),
            new House(18, 50, 120, 2, 2, "Working", "office", 70)};


    @Before
    public void setUp() {
        System.out.println("Before method");
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void tearDown() {
        System.setOut(this.out);
        input = null;
        System.out.println("After method");
    }

    @Test
    public void whenOutNumberOfRooms() throws IOException {
        String[] value = {"3", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRooms(this.houses, input);
        assertThat(mem.toString(), is(String.format("House{id = 13, apartmentNumber = 48, area = 12, floor = 14, numberOfRooms = 3, street = 'Working', buildingType = 'office', lifetime = 56}%n")));
    }

    @Test
    public void whenOutNumberOfRoomsNegative() throws IOException {
        String[] value = {"-3", "15", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRooms(this.houses, input);
        assertThat(mem.toString(), is(String.format("Numbers cannot be negative%n")));
    }

    @Test
    public void whenOutNumberOfRoomsLetter() throws IOException {
        String[] value = {"a", "15", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRooms(this.houses, input);
        assertThat(mem.toString(), is(String.format("You entered invalid characters, only numbers can be entered%n")));
    }

    @Test
    public void whenOutNumberOfRoomsLetterArrayIsEmpty() throws IOException {
        House[] houses = {};
        String[] value = {"3"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRooms(houses, input);
        assertThat(mem.toString(), is(String.format("The array is empty%n")));
    }

    @Test
    public void whenOutNumberOfRoomsReEntry() throws IOException {
        String[] value = {"15", "N", "20", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRooms(this.houses, input);
        assertThat(mem.toString(), is(""));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorRoomNegative() throws IOException {
        String[] value = {"-3", "16", "13", "300", "100", "100", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(this.houses, input);
        assertThat(mem.toString(), is(String.format("Numbers cannot be negative%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorRoomNegativeMax() throws IOException {
        String[] value = {"3", "-16", "13", "300", "100", "100", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(this.houses, input);
        assertThat(mem.toString(), is(String.format("Numbers cannot be negative%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorRoomNegativeMin() throws IOException {
        String[] value = {"3", "16", "-13", "300", "100", "100", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(this.houses, input);
        assertThat(mem.toString(), is(String.format("Numbers cannot be negative%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorRoomNegativeAll() throws IOException {
        String[] value = {"-3", "-16", "-13", "300", "100", "100", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(this.houses, input);
        assertThat(mem.toString(), is(String.format("Numbers cannot be negative%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloor() throws IOException {
        String[] value = {"3", "16", "13", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(this.houses, input);
        assertThat(mem.toString(), is(String.format("House{id = 13, apartmentNumber = 48, area = 12, floor = 14, numberOfRooms = 3, street = 'Working', buildingType = 'office', lifetime = 56}%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorLetter() throws IOException {
        String[] value = {"a", "16", "13", "0", "200", "200", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(this.houses, input);
        assertThat(mem.toString(), is(String.format("You entered invalid characters, only numbers can be entered%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorIsEmpty() throws IOException {
        House[] houses = {};
        String[] value = {"3", "12", "14"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(houses, input);
        assertThat(mem.toString(), is(String.format("The array is empty%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorIsEmptyReEntry() throws IOException {
        String[] value = {"10", "12", "14", "N", "3", "16", "14"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(houses, input);
        assertThat(mem.toString(), is(String.format("House{id = 13, apartmentNumber = 48, area = 12, floor = 14, numberOfRooms = 3, street = 'Working', buildingType = 'office', lifetime = 56}%n")));
    }

    @Test
    public void whenOutNumberOfRoomsAndFloorIsEmptyReEntryRoom() throws IOException {
        String[] value = {"3", "16", "14"};
        this.input = new StubInput(value);
        new HouseDatabase().searchNumberOfRoomsAndFloor(houses, input);
        assertThat(mem.toString(), is(String.format("House{id = 13, apartmentNumber = 48, area = 12, floor = 14, numberOfRooms = 3, street = 'Working', buildingType = 'office', lifetime = 56}%n")));
    }

    @Test
    public void whenOutArea() throws IOException {
        String[] value = {"120"};
        this.input = new StubInput(value);
        new HouseDatabase().searchArea(this.houses, input);
        assertThat(mem.toString(), is(String.format("House{id = 18, apartmentNumber = 50, area = 120, floor = 2, numberOfRooms = 2, street = 'Working', buildingType = 'office', lifetime = 70}%n")));
    }

    @Test
    public void whenOutAreaNegative() throws IOException {
        String[] value = {"-120", "9999", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchArea(this.houses, input);
        assertThat(mem.toString(), is(String.format("Numbers cannot be negative%n")));
    }

    @Test
    public void whenOutAreaLetter() throws IOException {
        String[] value = {"a", "9999", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchArea(this.houses, input);
        assertThat(mem.toString(), is(String.format("You entered invalid characters, only numbers can be entered%n")));
    }

    @Test
    public void whenOutAreaIsEmpty() throws IOException {
        House[] houses = {};
        String[] value = {"120"};
        this.input = new StubInput(value);
        new HouseDatabase().searchArea(houses, input);
        assertThat(mem.toString(), is(String.format("The array is empty%n")));
    }

    @Test
    public void whenOutAreaReEntry() throws IOException {
        String[] value = {"9999", "N", "120", "Y"};
        this.input = new StubInput(value);
        new HouseDatabase().searchArea(houses, input);
        assertThat(mem.toString(), is(String.format("House{id = 18, apartmentNumber = 50, area = 120, floor = 2, numberOfRooms = 2, street = 'Working', buildingType = 'office', lifetime = 70}%n")));
    }

    @Test
    public void whenTestSelect() throws IOException {
        String[] value = {"0"};
        this.input = new StubInput(value);
        new HouseDatabase().select(this.houses, input);
        assertThat(mem.toString(), is(System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "Smile more often and the world will smile at you!" + System.lineSeparator()));
    }

    @Test
    public void whenTestSelectDefault() throws IOException {
        String[] value = {"4", "0"};
        this.input = new StubInput(value);
        new HouseDatabase().select(this.houses, input);
        assertThat(mem.toString(), is(System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "There is no such item in the list" + System.lineSeparator() +
                System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "Smile more often and the world will smile at you!" + System.lineSeparator()));
    }

    @Test
    public void whenTestSelectCase1() throws IOException {
        String[] value = {"1", "3", "0"};
        this.input = new StubInput(value);
        new HouseDatabase().select(this.houses, input);
        assertThat(mem.toString(), is(System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "House{id = 13, apartmentNumber = 48, area = 12, floor = 14, numberOfRooms = 3, street = 'Working', buildingType = 'office', lifetime = 56}" + System.lineSeparator() +
                System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "Smile more often and the world will smile at you!" + System.lineSeparator()));
    }

    @Test
    public void whenTestSelectCase2() throws IOException {
        String[] value = {"2", "3", "15", "14", "0"};
        this.input = new StubInput(value);
        new HouseDatabase().select(this.houses, input);
        assertThat(mem.toString(), is(System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "House{id = 13, apartmentNumber = 48, area = 12, floor = 14, numberOfRooms = 3, street = 'Working', buildingType = 'office', lifetime = 56}" + System.lineSeparator() +
                System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "Smile more often and the world will smile at you!" + System.lineSeparator()));
    }

    @Test
    public void whenTestSelectCase3() throws IOException {
        String[] value = {"3", "120", "0"};
        this.input = new StubInput(value);
        new HouseDatabase().select(this.houses, input);
        assertThat(mem.toString(), is(System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "House{id = 18, apartmentNumber = 50, area = 120, floor = 2, numberOfRooms = 2, street = 'Working', buildingType = 'office', lifetime = 70}" + System.lineSeparator() +
                System.lineSeparator() + "Menu:" +
                System.lineSeparator() + "1.Search for apartments by number of rooms" +
                System.lineSeparator() + "2.Search for apartments by number of rooms and floor" +
                System.lineSeparator() + "3.Search for apartments by area size" +
                System.lineSeparator() + "0.Exit" +
                System.lineSeparator() + "Smile more often and the world will smile at you!" + System.lineSeparator()));
    }
}
