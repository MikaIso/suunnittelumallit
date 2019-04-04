package tehtava7;

/**
 *
 * @author Mika
 */
public class Charmeleon extends PokemonTila {

    private final double paino, pituus;
    private final String nimi;
    private final static Charmeleon ILMENTYMÄ = new Charmeleon();

    private Charmeleon() {
        paino = 19.0;
        pituus = 1.1;
        nimi = "Charmeleon";
    }

    public static Charmeleon getInstance() {
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
        pokemon.vaihdaTila(Charizard.getInstance());
    }
}
