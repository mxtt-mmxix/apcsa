//Dancer class 
public class Dancer extends Performer {
    public Dancer(String Name, int Age) {
        super(Name, Age);
    }

    public void perform() {
        super.perform();
        System.out.println("Dancing on the stage");
    }

}//closes class