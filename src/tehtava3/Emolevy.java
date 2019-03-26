package tehtava3;

/**
 *
 * @author Mika
 */
public class Emolevy implements Laiteosa {

    private double hinta;
    public Laiteosa[] komponentit = {
        new Muistipiiri(),
        new Prosessori(),
        new Verkkokortti(),
        new Näytönohjain()
    };
    
    @Override
    public double haeHinta() {
        return laskeHinta();
    }
    
    private double laskeHinta() {
        hinta = 0;
        for (Laiteosa l : komponentit) {
            hinta += l.haeHinta();
        }
        hinta += 100;
        return hinta;
    }

    public Emolevy() {
        hinta = laskeHinta();
    }
    
}
