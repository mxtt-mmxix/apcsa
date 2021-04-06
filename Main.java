public class Main {

    public static void main(String[] args) {
        //Date: 4/6/21
        //Aim: How can we apply parent and child classes to a java program?

        //Do Now: Create a new repl.it folder for Unit 9 - Inheritance along with a new lesson 73. 

        //copy and paste the following into the main method 
        Performer julia = new Performer("Julia", 26, "Rockaway");

        Musician jake = new Musician("Jake", 28, "Bayside", "Trumpet");

        Performer susan = new Musician("Susan", 24, "Rosedale", "Sax");

        System.out.println(julia.getName());
        System.out.println(julia.getAge());
        System.out.println(julia.getHomeTown());

        System.out.println(jake.getName());
        System.out.println(jake.getAge());
        System.out.println(jake.getInstrument());
        jake.playInstrument();

        System.out.println(susan.getName());
        System.out.println(susan.getAge());
        System.out.println(susan.getHomeTown());

        /*1. Explain which methods can be called on a Performer object.*/
        // The getName(), getAge(), and getHomeTown() methods can be called on a Perfromer object.

        /*2. Explain which methods can be called on a Musician object.*/
        // The getName(), getAge(), getHomeTown(), getInstrument(), and playInstrument() methods can be called on a Perfromer object.

        /*3. Explain which methods can be called on a Comedian object. */
        // The getName(), getAge(), getHomeTown(), getJoke() methods can be called on a Perfromer object.

        /*4. susan.getInstrument(); Why does this line cause an error? */
        // This line creates an error because susan is of type Performer which does not have a getInstrument() method.

        /*5. Which class is the parent class and which is the child class? What is another set of terms to describe this relationship?*/
        // Performer is the parent class, Musician and Comedian are child classes. Another set of terms are super-sub classes.

        /*6. Describe the is-a relationship compared to the has-a relationship.*/
        // A Musician a Performer, but a Performer isn't necessarily is Musician.

    }//closes method 

}//closes class