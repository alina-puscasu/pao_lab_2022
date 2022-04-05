package generice;

public class Box <T, S> {
    // E - element
    // K - key
    // V - value of a pair key-value from map
    // T, S, U

    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {return t;}
    public S getSecond() {return s;}

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                ", s=" + s +
                '}';
    }

    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>();
        box.add(10, "My String");
        System.out.println("Integer value: " + box.getFirst());
        System.out.println("String value: " + box.getSecond());

        Box<String, String> box2 = new Box<>();
        box2.add("My String 1", "My String2");
        System.out.println("String value: " + box2.getFirst());
        System.out.println("String value: " + box2.getSecond());
    }
}
