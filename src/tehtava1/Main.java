package tehtava1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        
        AterioivaOtus kasvitieteilijä = new Kasvitieteilijä();
        kasvitieteilijä.aterioi();
    }
}
