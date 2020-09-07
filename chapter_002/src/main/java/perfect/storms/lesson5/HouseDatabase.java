package perfect.storms.lesson5;

import java.io.IOException;

public class HouseDatabase {

    private static House[] house = {
            new House(10, 24, 250, 6, 3),
            new House(8, 40, 600, 10, 3),
            new House(40, 9, 2, "Avenue"),
            new House(10, 2, 3, "Avenue"),
            new House(8, 2, "South"),
            new House(12, 3, "South"),
            new House(18, 48, 1200, 11, 2, "Working", "office", 70),
            new House(13, 48, 12, 14, 3, "Working", "office", 56),
    };

    public void searchNumberOfRooms(House[] houses, Input input) throws IOException {
        int count = 0;
        boolean run = true;
        String numberOfRooms;
        do {
            numberOfRooms = input.askStr("Enter the number of rooms to find an apartment");
        } while (!checkInput(numberOfRooms));
        if (houses.length != 0) {
            while (run) {
                for (House house : houses) {
                    if (house.getNumberOfRooms() == Integer.parseInt(numberOfRooms)) {
                        System.out.println(house);
                        count++;
                    }
                }
                if (count == 0) {
                    String answer = input.askStr("There are no apartments with so many rooms, if you want to end the search click \"Y\". If you want to continue your search click \"N\".");
                    run = check(answer);
                    if (run) {
                        searchNumberOfRooms(houses, input);
                    }
                }
                run = false;
            }
        } else {
            System.out.println("The array is empty");
        }
    }

    private boolean check(String value) {
        while (true) {
            if (value.equals("Y")) {
                return false;
            } else if (value.equals("N")) {
                return true;
            }
        }
    }

    public void searchNumberOfRoomsAndFloor(House[] houses, Input input) throws IOException {
        boolean result = true;
        boolean run = true;
        int count = 0;
        String numberOfRooms;
        String maxFloor;
        String minFloor;
        do {
            numberOfRooms = input.askStr("Enter the number of rooms");
            maxFloor = input.askStr("Enter the maximum floor to search in the interval");
            minFloor = input.askStr("Enter the minimum floor to search in the interval");
            if (checkInput(numberOfRooms) && checkInput(maxFloor) && checkInput(minFloor)) {
                result = false;
            }
        } while (result);
        if (houses.length != 0) {
            while (run) {
                for (House house : houses) {
                    if (house.getFloor() >= Integer.parseInt(minFloor)
                            && house.getFloor() <= Integer.parseInt(maxFloor)
                            && house.getNumberOfRooms() == Integer.parseInt(numberOfRooms)) {
                        System.out.println(house);
                        count++;
                    }
                }
                if (count == 0) {
                    String answer = input.askStr("There are no apartments with so many rooms on those floors, if you want to end the search click \"Y\". If you want to continue your search click \"N\".");
                    run = check(answer);
                    if (run) {
                        searchNumberOfRoomsAndFloor(houses, input);
                    }
                }
                run = false;
            }
        } else {
            System.out.println("The array is empty");
        }
    }

    public void searchArea(House[] houses, Input input) throws IOException {
        int count = 0;
        boolean run = true;
        String area;
        do {
            area = input.askStr("Enter the size of the area to search");
        } while (!checkInput(area));
        if (houses.length != 0) {
            while (run) {
                for (House house : houses) {
                    if (house.getArea() >= Integer.parseInt(area)) {
                        count++;
                        System.out.println(house);
                    }
                }
                if (count == 0) {
                    String answer = input.askStr("There are no apartments with this size, if you want to end the search click \"Y\". If you want to continue your search click \"N\".");
                    run = check(answer);
                    if (run) {
                        searchArea(houses, input);
                    }
                }
                run = false;
            }
        } else {
            System.out.println("The array is empty");
        }
    }

    private boolean checkInput(String value) {
        boolean result = false;
        if (value.split("")[0].equals("-")) {
            System.out.println("Numbers cannot be negative");
            return false;
        }
        for (int index = 0; index < value.length(); index++) {
            for (int element = 0; element <= 9; element++) {
                if (value.split("")[index].equals(element + "")) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
            if (!result) {
                System.out.println("You entered invalid characters, only numbers can be entered");
                return false;
            }
        }
        return result;
    }

    public void select(House[] houses, Input input) throws IOException {
        boolean run = true;
        while (run) {
            menu();
            String number = input.askStr("Select");
            switch (number) {
                case "1":
                    searchNumberOfRooms(houses, input);
                    break;
                case "2":
                    searchNumberOfRoomsAndFloor(houses, input);
                    break;
                case "3":
                    searchArea(houses, input);
                    break;
                case "0":
                    run = false;
                    System.out.println("Smile more often and the world will smile at you!");
                    break;
                default:
                    System.out.println("There is no such item in the list");
            }
        }
    }

    private void menu() {
        System.out.println(System.lineSeparator() + "Menu:");
        System.out.println("1.Search for apartments by number of rooms");
        System.out.println("2.Search for apartments by number of rooms and floor");
        System.out.println("3.Search for apartments by area size");
        System.out.println("0.Exit");
    }

//    public static void main(String[] args) throws IOException {
//        Input input = new ConsoleInput();
//        new HouseDatabase().select(house, input);
//    }
}
