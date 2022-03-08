package pao.exercise.lab2;

public class Room {
    private int number;
    private int floor;
    private String type;

    public Room(int number, int floor, String type) {
        this.number = number;
        this.floor = floor;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", floor=" + floor +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Room r1 = new Room(10, 2, "single");
        Room r2 = new Room(20, 4, "double");
        System.out.println(r1);
        System.out.println(r2);
    }
}
