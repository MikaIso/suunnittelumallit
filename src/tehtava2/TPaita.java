package tehtava2;

/**
 *
 * @author Mika
 */
public class TPaita implements Vaate {

    String brand = null;
    
    @Override
    public String toString() {
        return "t-paita, valmistaja: " + brand + ".";
    }

    public TPaita() {
        
    }
    
    public TPaita(String brand) {
        this.brand = brand;
    }
}
