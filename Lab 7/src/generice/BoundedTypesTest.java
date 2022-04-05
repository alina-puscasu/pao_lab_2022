package generice;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    protected String name = "Pizza";

    public String getName() {return name;}

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}

class HamPizza extends Pizza {
    public HamPizza() {
        name = "HamPizza";
    }
}

class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "CheesePizza";
    }
}

public class BoundedTypesTest {

    // upper bound - pentru a parcurge o colectie
    public static <T extends Pizza> void listPizza(T[] pizzaArray){
        System.out.println("Different types of pizza:");
        for (T t : pizzaArray) {
            System.out.println(t.getName());
        }
    }

    public static void main(String[] args) {
        BoundedTypesTest.listPizza(new Pizza[]{new HamPizza(), new CheesePizza(), new Pizza()});

        List<? super HamPizza> lowerBoundPizzaList = new ArrayList<>();
        lowerBoundPizzaList.add(new HamPizza());
        System.out.println(lowerBoundPizzaList);


    }

}
