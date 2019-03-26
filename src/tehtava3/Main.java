package tehtava3;

/**
 *
 * @author Mika
 */
public class Main {
    
    public static void main(String[] args) {
        
        Tietokone tkone = new Tietokone();
        tkone.lisääOsa(new Emolevy());
        tkone.lisääOsa(new Kotelo());
        System.out.println("Tietokoneen kokonaishinta: " + tkone.laskeHinta() + "\n");
        
        tkone = new Tietokone();
        tkone.lisääOsa(new Muistipiiri());
        tkone.lisääOsa(new Prosessori());
        tkone.lisääOsa(new Verkkokortti());
        System.out.println("Tietokoneen kokonaishinta: " + tkone.laskeHinta() + "\n");
    }
}
