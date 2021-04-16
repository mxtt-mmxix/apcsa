import java.util.List;
import java.util.ArrayList;
import java.text.*;

interface MenuItem {
    /** @return the name of the menu item */
    String getName();

    /** @return the price of the menu item */
    double getPrice();
}

class SimpleLunchItem implements MenuItem {
    private String name;
    private double price;

    public SimpleLunchItem(String aName, double aPrice) {
        name = aName;
        price = aPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        DecimalFormat money = new DecimalFormat("0.00");
        return getName() + " " + money.format(getPrice());
    }
}

class Drink extends SimpleLunchItem {
    public Drink(String name, double price) {
        super(name, price);
    }
}

class Salad extends SimpleLunchItem {
    public Salad(String name, double price) {
        super(name, price);
    }
}

class Sandwich extends SimpleLunchItem {
    public Sandwich(String name, double price) {
        super(name, price);
    }
}

// Declare the Trio class.  It must implement the MenuItem interface.
public class Trio implements MenuItem {
    // declare the instance variables that you need for a trio object
    private MenuItem[] items = new MenuItem[3];

    // write a constructor that takes a Sandwich, Salad, and a Drink, in that order
    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        items[0] = sandwich;
        items[1] = salad;
        items[2] = drink;
    }

    // write the getName method it should return
    // sandwich name/salad name/drink name Trio
    @Override
    public String getName() {
        return items[0].getName() + '/' + items[1].getName() + '/' + items[2].getName() + " Trio";
    }

    // write the getPrice method
    // it should return the price of the two highest price items in the trio.
    @Override
    public double getPrice() {
        double price = 0;
        double lowestPrice = items[0].getPrice();

        for (MenuItem item : items) {
            price += item.getPrice();
            if (item.getPrice() < lowestPrice) {
                lowestPrice = item.getPrice();
            }
        }

        return price -= lowestPrice;

    }

}
