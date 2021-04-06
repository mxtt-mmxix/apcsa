//Musician Class
public class Musician extends Performer {

    private String instrument;

    public Musician(String Name, int Age, String HT, String i) {
        super(Name, Age, HT);
        instrument = i;

    }

    public String getInstrument() {
        return instrument;
    }

    public void playInstrument() {
        System.out.println("Music is playing!");
    }
}