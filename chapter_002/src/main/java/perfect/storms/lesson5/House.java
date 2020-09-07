package perfect.storms.lesson5;

public class House {

    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private  int numberOfRooms;
    private String street;
    private String buildingType;
    private int lifetime;

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
    }

    public House(int apartmentNumber, int floor, int numberOfRooms, String street) {
        this.apartmentNumber = apartmentNumber;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }

    public House(int apartmentNumber, int floor, String street) {
        this.apartmentNumber = apartmentNumber;
        this.floor = floor;
        this.street = street;
    }

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms, String street, String buildingType, int lifetime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifetime = lifetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id = " + id +
                ", apartmentNumber = " + apartmentNumber +
                ", area = " + area +
                ", floor = " + floor +
                ", numberOfRooms = " + numberOfRooms +
                ", street = '" + street + '\'' +
                ", buildingType = '" + buildingType + '\'' +
                ", lifetime = " + lifetime +
                '}';
    }
}
