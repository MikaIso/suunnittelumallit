package tehtava5;

/**
 *
 * @author Mika
 */
public class Main {

    private static Singleton olio;

    public static void main(String[] args) {
        try {
            System.out.println(olio.toString());
        } catch (NullPointerException e) {
            System.out.println("Aiheutui NullPointerException. Luodaan singleton-olio.");
        }        
        olio = Singleton.getInstance();
        System.out.println(olio.toString());
    }
}
