package tehtava3;

/**
 *
 * @author Mika
 */
public class Kotelo implements Laiteosa {

    private double hinta;
    private Laiteosa[] komponentit = {
        new Emolevy()
    };
    
    @Override
    public double haeHinta() {
        return hinta;
    }
    
    private double laskeHinta() {
        hinta = 0;
        for (Laiteosa l : komponentit) {
            hinta += l.haeHinta();
        }
        hinta += 60;
        return hinta;
    }

    public Kotelo() {
        hinta = laskeHinta();
    }
    
}
