public class Main {

    //Date: 4/15/21
    //Aim: How can we identify and use polymorphism in a java program?

    //Do Now: Examine the Shape class and each of its subclasses. 

    //Polymorphism: To have many forms. In Java it means that the method that gets called at run-time (when the code is run) depends on the type of the object at run-time.

    public static void main(String[] args) {
        Shape[] shapes = { new Shape(), new Rectangle(), new Square(), new Circle() };
        for (Shape s : shapes) {
            s.what();
            System.out.print(" ");
        } //closes loop to print Shapes 

        Shape s1 = new Rectangle();

        System.out.println();

        /*
        s1.info(); Why does this line result in an error message? 
        How can this be fixed? (Fix it once you know!)
        s1.info() results in an error messahe because s1 is stored as a Shape which does not have an info() method.
        */

        ((Rectangle) s1).info();
        (new Square()).info();
        (new Circle()).info();

        /*Add an info method to each subclass. Instantiate a Shape object but uses the constructor from a different subclass each time i.e. Rectangle, Square etc. */
    }//closes main method 

}//closes class