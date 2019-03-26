package tehtava3;

/**
 *
 * @author Mika
 */
public class Muistipiiri implements Laiteosa {

    private double hinta;

    @Override
    public double haeHinta() {
        return hinta;
    }

    public Muistipiiri() {
        hinta = 65;
    }

    public Muistipiiri(double hinta) {
        this.hinta = hinta;
    }
    
}
