public class Main {

    //Date: 4/15/21
    //Aim: How can we identify and use polymorphism in a java program?

    //Do Now: Examine the Shape class and each of its subclasses. 

    //Polymorphism: To have many forms. In Java it means that the method that gets called at run-time (when the code is run) depends on the type of the object at run-time.

    public static void main(String[] args) {
        Sandwich burger = new Sandwich("Cheeseburger", 2.75);
        Sandwich club = new Sandwich("Club Sandwich", 2.75);
        Salad spinachSalad = new Salad("Spinach Salad", 1.25);
        Salad coleslaw = new Salad("Coleslaw", 1.25);
        Drink orange = new Drink("Orange Soda", 1.25);
        Drink cap = new Drink("Cappuccino", 3.50);
        Trio trio1 = new Trio(burger, spinachSalad, orange);
        System.out.println(
                "It should print Cheeseburger/Spinach Salad/Orange Soda Trio and it prints: " + trio1.getName());
        System.out.println("It should print 4.0 and it prints: " + trio1.getPrice());
        Trio trio2 = new Trio(club, coleslaw, cap);
        System.out.println("It should print Club Sandwich/Coleslaw/Capuccino Trio and it prints: " + trio2.getName());
        System.out.println("It should print 6.25 and it prints: " + trio2.getPrice());
    }

}//closes class