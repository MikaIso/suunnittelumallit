package tehtava3;

/**
 *
 * @author Mika
 */
public class Näytönohjain implements Laiteosa {

    private double hinta;
    
    @Override
    public double haeHinta() {
        return hinta;
    }

    public Näytönohjain() {
        hinta = 175;
    }

    public Näytönohjain(double hinta) {
        this.hinta = hinta;
    }
    
}
