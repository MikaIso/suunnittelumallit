package tehtava2;

/**
 *
 * @author Mika
 */
public class Lippis implements Vaate {

    String brand = null;
    
    @Override
    public String toString() {
        return "lippis, valmistaja: " + brand + ".";
    }

    public Lippis() {
        
    }
    
    public Lippis(String brand) {
        this.brand = brand;
    }
    
}
