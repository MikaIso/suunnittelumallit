package tehtava3;

/**
 *
 * @author Mika
 */
public class Verkkokortti implements Laiteosa {

    private double hinta;
    
    @Override
    public double haeHinta() {
        return hinta;
    }

    public Verkkokortti() {
        hinta = 75;
    }

    public Verkkokortti(double hinta) {
        this.hinta = hinta;
    }
    
}
