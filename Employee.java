//Employee class
public class Employee extends Person {
    private String jobTitle;

    public Employee() {
        super(); // calls the Person() constructor
    }

    public Employee(String Name, int Age, String job) {
        super(Name, Age);
        // calls Person(Name, Age) constructor

        jobTitle = job;
    }

    public String getJob() {
        return jobTitle;
    }

    //Override toString method here
    @Override
    public String toString() {
        return super.toString() + " I am a " + jobTitle + ".";
    }

}//closes class