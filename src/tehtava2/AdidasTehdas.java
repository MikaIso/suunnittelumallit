package tehtava2;

/**
 *
 * @author Mika
 */
public class AdidasTehdas implements VaateTehdas {
    
    String brand = "Adidas";

    @Override
    public Farkut teeFarkut() {
        return new Farkut(brand);
    }

    @Override
    public Kengät teeKengät() {
        return new Kengät(brand);
    }

    @Override
    public Lippis teeLippis() {
        return new Lippis(brand);
    }

    @Override
    public TPaita teeTPaita() {
        return new TPaita(brand);
    }
    
}
