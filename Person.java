//Person class
public class Person {

    private String name;
    private int age;

    //default constructor
    public Person() {
        name = "";
        age = 0;
    }

    public Person(String Name, int Age) {
        name = Name;
        age = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Hello, my name is " + getName() + ". I am " + getAge() + " years old.";
    }

}//closes class