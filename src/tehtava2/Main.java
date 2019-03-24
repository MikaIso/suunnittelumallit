package tehtava2;

/**
 *
 * @author Mika
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pukeutuja jasper = new Pukeutuja();
        VaateTehdas tehdas = new AdidasTehdas();
        
        System.out.println("Jasper Java opiskelee tieto- ja viestintätekniikkaa.\nHän kertoo:");
        jasper.pukeudu(tehdas);
        jasper.kerroPukeutuminen();
        System.out.println("");
        
        System.out.println("Jasper Java valmistuu insinööriksi.\nHän kertoo:");
        tehdas = new BossTehdas();
        jasper.pukeudu(tehdas);
        jasper.kerroPukeutuminen();
        
    }
}
