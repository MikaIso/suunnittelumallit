package tehtava7;

/**
 *
 * @author Mika
 */
public class Charmander extends PokemonTila {

    private final double paino, pituus;
    private final String nimi;
    private final static Charmander ILMENTYMÄ = new Charmander();

    private Charmander() {
        paino = 8.5;
        pituus = 0.6;
        nimi = "Charmander";
    }

    public static Charmander getInstance() {
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
        pokemon.vaihdaTila(Charmeleon.getInstance());
    }

}
