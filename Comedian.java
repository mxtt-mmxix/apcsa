//Comedian Class

import java.util.*;

public class Comedian extends Performer {
    private ArrayList<String> jokes;

    public Comedian(String Name, int Age, String HT) {
        super(Name, Age, HT);
        jokes = new ArrayList<String>();
    }

    public void getJoke(int jokeNum) {
        for (int i = 0; i < jokes.size(); i++) {
            if (jokeNum == i) {
                System.out.println(jokes.get(i));
            }
        }
    }//closes method
}