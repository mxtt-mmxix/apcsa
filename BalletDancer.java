//BalletDancer class
public class BalletDancer extends Dancer {

    public BalletDancer(String Name, int Age) {
        super(Name, Age);
    }

    public void jete() {
        System.out.println("Leaping");
    }

    public void pirouette() {
        System.out.println("Spinning");
    }

    public void perform() {
        super.perform();
        jete();
        pirouette();
    }

}//closes class