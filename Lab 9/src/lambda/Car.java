package lambda;

@FunctionalInterface
interface Engine {
    int getFuelCapacity();
}

public class Car {
    public Engine getEngine(int fuelCapacity) {
        return () -> fuelCapacity;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getEngine(11).getFuelCapacity());
    }
}
