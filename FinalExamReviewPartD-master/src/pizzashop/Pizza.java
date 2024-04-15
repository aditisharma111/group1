package pizzashop;

import java.util.ArrayList;

public class Pizza {

    public int bakeTemp = 100;
    private final ArrayList<String> toppings = new ArrayList<>();

    public Pizza() {
    }

    public void bake(int temp) {
        bakeTemp = temp;
        // Common baking logic here
        System.out.println("Baking the pizza at " + bakeTemp + " degrees Celsius.");
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
}
