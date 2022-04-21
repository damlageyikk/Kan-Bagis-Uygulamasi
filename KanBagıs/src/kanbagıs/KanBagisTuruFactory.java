package kanbagıs;

public class KanBagisTuruFactory {

    public KanBagisTuru getKanBagisTuru(String bagisTuru) {
        if (bagisTuru == null) {
            return null;
        }
        if (bagisTuru.matches("Eritrosit")) {
            EritrositJ eritrosit = new EritrositJ();
            eritrosit.setVisible(false);
            eritrosit.setVisible(true);
            return (KanBagisTuru) eritrosit;
        }
        if (bagisTuru.matches("Trombosit")) {
            TrombositJ trombosit = new TrombositJ();
            trombosit.setVisible(false);
            trombosit.setVisible(true);
            return (KanBagisTuru) trombosit;
        }
        if (bagisTuru.matches("Plazma")) {
            PlazmaJ plazma = new PlazmaJ();
            plazma.setVisible(false);
            plazma.setVisible(true);
            return (KanBagisTuru) plazma;
        }

        return null;

    }

}
