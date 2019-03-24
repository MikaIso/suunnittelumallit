package tehtava2;

/**
 *
 * @author Mika
 */
public class Farkut implements Vaate {

    String brand = null;
    
    @Override
    public String toString() {
        return "farkut, valmistaja: " + brand + ".";
    }
    
    public Farkut () {
        
    }
    
    public Farkut (String brand) {
        this.brand = brand;
    }

}
