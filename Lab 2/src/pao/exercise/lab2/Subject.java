package pao.exercise.lab2;

public class Subject {
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "room=" + room +
                ", noOfStudents=" + noOfStudents +
                ", teacher=" + teacher +
                '}';
    }

    public static void main(String[] args) {
        Subject s1 = new Subject(new Room(13, 3, "single"), 3, new Person("Ionescu", "Marian", 40, 123, "Science"));
        System.out.println(s1);
    }
}
