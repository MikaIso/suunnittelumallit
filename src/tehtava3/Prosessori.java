package tehtava3;

/**
 *
 * @author Mika
 */
public class Prosessori implements Laiteosa {

    private double hinta;
    
    @Override
    public double haeHinta() {
        return hinta;
    }

    public Prosessori() {
        hinta = 235;
    }

    public Prosessori(double hinta) {
        this.hinta = hinta;
    }
    
}
