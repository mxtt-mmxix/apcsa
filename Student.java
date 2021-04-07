public class Student extends Person {

    private int gradeLevel;

    public Student(String Name, int Age, int gradeLevel) {
        super(Name, Age); // calls Person(Name, Age) constructor
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " I am in " + gradeLevel + "th grade.";
    }

}
