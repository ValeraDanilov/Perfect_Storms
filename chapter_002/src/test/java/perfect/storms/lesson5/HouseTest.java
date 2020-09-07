package perfect.storms.lesson5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HouseTest {

    House house;

    @Before
    public void setUp() {
       house = new House(18, 48, 1200, 14, 2, "Working", "office", 70);
        System.out.println("Before method");
    }

    @After
    public void tearDown() {
        house = null;
        System.out.println("After method");
    }

    @Test
    public void whenCreateObjectWithParametersIdApartmentNumberAreaFloorNumberOfRooms() {
        House house = new House(10, 24, 250, 6, 3);
        assertThat(house.toString(), is(new House(10, 24, 250, 6, 3).toString()));
    }

    @Test
    public void whenCreateObjectWithParametersApartmentNumberFloorNumberOfRoomsStreet() {
        House house = new House(40, 9, 2, "Avenue");
        assertThat(house.toString(), is(new House(40, 9, 2, "Avenue").toString()));
    }

    @Test
    public void whenCreateObjectWithParametersApartmentNumberFloorStreet() {
        House house = new House(8, 2, "South");
        assertThat(house.toString(), is(new House(8, 2, "South").toString()));
    }

    @Test
    public void whenCreateObjectWithParametersIdApartmentNumberAreaFloorNumberOfRoomsStreetBuildingTypeLifetime() {
        House house = new House(18, 48, 1200, 14, 2, "Working", "office", 70);
        assertThat(house.toString(), is(new House(18, 48, 1200, 14, 2, "Working", "office", 70).toString()));
    }

    @Test
    public void whenReturnSetIdAndGetId() {
        house.setId(17);
        int id = house.getId();
        assertThat(id, is(17));
    }

    @Test
    public void whenReturnSetApartmentNumberAndGetApartmentNumber() {
        house.setApartmentNumber(50);
        int apartmentNumber = house.getApartmentNumber();
        assertThat(apartmentNumber, is(50));
    }

    @Test
    public void whenReturnSetAreaAndGetArea() {
        house.setArea(1500);
        int area = house.getArea();
        assertThat(area, is(1500));
    }

    @Test
    public void whenReturnSetFloorAndGetFloor() {
        house.setFloor(15);
        int floor = house.getFloor();
        assertThat(floor, is(15));
    }

    @Test
    public void whenReturnSetNumberOfRoomsFloorAndGetNumberOfRooms() {
        house.setNumberOfRooms(5);
        int numberOfRooms = house.getNumberOfRooms();
        assertThat(numberOfRooms, is(5));
    }

    @Test
    public void whenReturnSetStreetAndGetStreet() {
        house.setStreet("Velichaya");
        String street = house.getStreet();
        assertThat(street, is("Velichaya"));
    }

    @Test
    public void whenReturnSetBuildingTypeAndGetBuildingType() {
        house.setBuildingType("Prom");
        String buildingType = house.getBuildingType();
        assertThat(buildingType, is("Prom"));
    }

    @Test
    public void whenReturnSetLifetimeAndGetLifetime() {
        house.setLifetime(100);
        int lifetime = house.getLifetime();
        assertThat(lifetime, is(100));
    }
}
