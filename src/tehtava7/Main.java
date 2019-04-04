package tehtava7;

/**
 *
 * @author Mika
 */
public class Main {
    
    private static Pokemon pokemon;

    public static void main(String[] args) {
        pokemon = new Pokemon();
        pokemon.haeNimi();
        pokemon.haePaino();
        pokemon.haePituus();
        
        System.out.println("Pokemon:\nLaji: " + pokemon.haeNimi() + "\nPituus: " + pokemon.haePituus() + " m\nPaino: " + pokemon.haePaino() + " kg\n");
        
        pokemon.muutaMuotoa();
        System.out.println("Pokemon:\nLaji: " + pokemon.haeNimi() + "\nPituus: " + pokemon.haePituus() + " m\nPaino: " + pokemon.haePaino() + " kg\n");
        pokemon.muutaMuotoa();
        System.out.println("Pokemon:\nLaji: " + pokemon.haeNimi() + "\nPituus: " + pokemon.haePituus() + " m\nPaino: " + pokemon.haePaino() + " kg\n");
    }
}
