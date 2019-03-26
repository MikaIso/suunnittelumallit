package tehtava3;

import java.util.ArrayList;

/**
 *
 * @author Mika
 */
public class Tietokone {

    private double kokonaishinta;
//    Laiteosa[] komponentit;
    private ArrayList<Laiteosa> komponentit = new ArrayList<Laiteosa>();

    public Tietokone() {
        kokonaishinta = 0;        
    }
    
    public void lisääOsa(Laiteosa osa) {
        komponentit.add(osa);
    }

    public double laskeHinta() {
        kokonaishinta = 0;

        for (Laiteosa l : komponentit) {
            kokonaishinta += l.haeHinta();
        }
        return kokonaishinta;
    }

}
