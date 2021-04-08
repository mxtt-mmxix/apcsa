//Performer class

public class Performer {

    private String name;
    private int age;

    public Performer(String Name, int Age) {
        name = Name;
        age = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void practice() {
        System.out.println("Honing my craft");
    }

    public void perform() {
        System.out.println("Performing for an audience");
    }
}