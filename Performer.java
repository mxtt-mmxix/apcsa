//Performer class
public class Performer {
    private String name;
    private int age;
    private String homeTown;

    public Performer(String Name, int Age, String HT) {
        name = Name;
        age = Age;
        homeTown = HT;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }
}