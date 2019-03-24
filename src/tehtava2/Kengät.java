package tehtava2;

/**
 *
 * @author Mika
 */
public class Kengät implements Vaate {

    String brand = null;
    
    @Override
    public String toString() {
        return "keng\u00e4t, valmistaja: " + brand + ".";
    }

    public Kengät() {
        
    }
    
    public Kengät (String brand) {
        this.brand = brand;
    }
    
}
