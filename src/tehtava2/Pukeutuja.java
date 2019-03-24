package tehtava2;

/**
 *
 * @author Mika
 */
public class Pukeutuja {
    
    Farkut farkut = null;
    Kengät kengät = null;
    Lippis lippis = null;
    TPaita tPaita = null;
    
    public void pukeudu(VaateTehdas tehdas) {
        farkut = tehdas.teeFarkut();
        kengät = tehdas.teeKengät();
        lippis = tehdas.teeLippis();
        tPaita = tehdas.teeTPaita();
    }
    
    public void kerroPukeutuminen() {
        System.out.println("Minulla on seuraavat vaatteet päälläni:");
        System.out.println(farkut.toString());
        System.out.println(kengät.toString());
        System.out.println(lippis.toString());
        System.out.println(tPaita.toString());
    }

    public Pukeutuja() {
        
    }
    
}
