package interfete.sealed;

public non-sealed class Car extends Vehicle implements Service {

    private final int numberOfSeats;

    public Car(int numberOfSeats, String registrationNumber ) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


}
