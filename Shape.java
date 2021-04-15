public class Shape {
    public void what() {
        System.out.print("Shape ");
    }
}//closes Shape class

class Rectangle extends Shape {
    public void what() {
        System.out.print("Rectangle ");
    }

    public void info() {
        System.out.println(
                "A rectangle is a plane figure with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square.");
    }
}//closes Rectangle class

class Square extends Rectangle {
    public void what() {
        System.out.print("Square ");
    }

    public void info() {
        System.out.println("A square is a perfect quadrilateral which congruent sides and conguent angles.");
    }

}//closes Square class

class Oval extends Shape {
    public void what() {
        System.out.print("Oval ");
    }

    public void info() {
        System.out.println("An oval is an elongated ellipse.");
    }
}//closes Oval class

class Circle extends Oval {
    public void what() {
        System.out.print("Circle ");
    }

    public void info() {
        System.out.println("A circle an ellipse in which every point on its perimeter is equidistant from its center.");
    }
}//closes Circle class