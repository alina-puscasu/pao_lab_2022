package interfete;

public class MyClass implements MyInterface, MyInterface2 {
    @Override
    public String sayHello() {
        System.out.println("Hello");
        return "Hello";
    }

    @Override
    public String sayBye() {
        System.out.println("Bye");
        return "Bye";
    }

    @Override
    public void saySomething() {
        System.out.println("Say something from MyClass");
    }

    @Override
    public void sameSignature() {
        System.out.println("Same signature from MyClass");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.saySomething();
        myClass.saySomething2();

        MyInterface.print(myClass.sayHello());
        MyInterface.print(myClass.sayBye());

        MyInterface myInterface = new MyClass();
        myInterface.sayHello();
        myInterface.saySomething();

//        MyInterface m1 = new MyInterface(); - not allowed, a class that implements the interface is needed

        MyInterface2 myInterface2 = new MyClass();
        myInterface2.sayBye();
    }
}
