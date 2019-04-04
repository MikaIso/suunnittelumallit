package tehtava7;

/**
 *
 * @author Mika
 */
public class Charizard extends PokemonTila {

    private final double paino, pituus;
    private final String nimi;
    private final static Charizard ILMENTYMÄ = new Charizard();

    private Charizard() {
        paino = 90.5;
        pituus = 1.7;
        nimi = "Charizard";
    }

    public static Charizard getInstance() {
        return ILMENTYMÄ;
    }

    @Override
    public double haePaino(Pokemon pokemon) {
        return paino;
    }

    @Override
    public double haePituus(Pokemon pokemon) {
        return pituus;
    }

    @Override
    public String haeNimi(Pokemon pokemon) {
        return nimi;
    }

    @Override
    public void muutaMuotoa(Pokemon pokemon) {
        pokemon.vaihdaTila(ILMENTYMÄ);
    }
}
