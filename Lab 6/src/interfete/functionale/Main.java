package interfete.functionale;

public class Main {

    public static void main(String[] args) {

        FunctionalInterfaceEx1 functionalInterfaceEx1 = new FunctionalInterfaceEx1() {
            @Override
            public void execute() {
                System.out.println("Executing...");
            }
        };

        FunctionalInterfaceEx1 functionalInterfaceEx1_1 = () -> {
            System.out.println("Executing from lambda...");
        };

        FunctionalInterfaceEx1 functionalInterfaceEx1_2 = new Test();

        functionalInterfaceEx1.execute();
        functionalInterfaceEx1_1.execute();
        functionalInterfaceEx1_2.execute();

        FunctionalInterfaceEx2 functionalInterfaceEx2 = () -> {
            System.out.println("Executing...");
        };

    }


}
