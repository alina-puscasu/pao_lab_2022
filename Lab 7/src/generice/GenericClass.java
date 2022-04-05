package generice;

public class GenericClass<T> { // generic type parameter - T can be any Object

    private T t;

    public void add(T t) {
        this.t = t;
    }

    <V> void print(V param) {
        System.out.println(param.toString());
    }

    public T get() {
        return t;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {
        // example of raw use of generics - everything is replaced with Object if generic type not specified
        GenericClass everything = new GenericClass(); // Object by default
        everything.add("myString");
        System.out.println(everything);
        everything.add(1L);
        everything.add(2);
        System.out.println(everything);
        everything.add(null);
        System.out.println(everything);

        // be specific! indicate the type of object
        GenericClass<String> string = new GenericClass<>();
        string.add("myString2");
        System.out.println(string.get());
        string.print(string);

        // always use diamond operator, compiler determines the type of param
        GenericClass<Integer> integer = new GenericClass<>();
        integer.add(1);
        System.out.println(integer.get());
        integer.print(integer);
    }
}
