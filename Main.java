public class Main {

    public static void main(String[] args) {
        //Date: 4/7/21 
        //Aim: How can we apply the concept of inheritance when writing a full subclass in java? 

        //Do Now: Copy and Paste the following into a new repl.it

        //main class - main method 

        Person p1 = new Person("Tom", 31);
        System.out.println(p1.toString());

        Employee e1 = new Employee("Tom", 31, "Teacher");
        System.out.println(e1.toString());

        /*1. Override the toString method from the Person class (Super class)
        in the Employee class so that it includes the job title as well.*/

        /*2. Write a new class called Student which is-a subclass of the Person class. 
        Add an additional private instance variable gradeLevel. How many constructors will you need? 
        Add a method getGradeLevel which returns a Student object's gradeLevel. 
        Override the toString method to include the Students gradeLevel as well. */

    }//closes method 

}//closes class