package tehtava5;

/**
 *
 * @author Mika
 */
public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Tämä on singleton";
    }
    
    
}