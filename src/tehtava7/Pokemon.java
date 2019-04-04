package tehtava7;

/**
 *
 * @author Mika
 */
public class Pokemon {
    
    private double paino, pituus;
    private String nimi;
    private PokemonTila tila;

    public Pokemon() {
        this.tila = Charmander.getInstance();
    }
    
    protected void vaihdaTila(PokemonTila tila) {
        this.tila = tila;
    }
    
    protected void muutaMuotoa() {
        switch(this.nimi) {
            case "Charmander":
                this.tila = Charmeleon.getInstance();
                break;
            case "Charmeleon":
                this.tila = Charizard.getInstance();
                break;
        }
    }
    
    public double haePaino() {
        paino = tila.haePaino(this);
        return paino;
    }
    
    public double haePituus() {
        pituus = tila.haePituus(this);
        return pituus;
    }
    
    public String haeNimi() {
        nimi = tila.haeNimi(this);
        return nimi;
    }
    
}
