package suunnittelumallit.mediator;

import java.util.ArrayList;
import java.util.List;


public class ConcreteMediator implements Mediator{
    private List<Kolleega> kolleegat;

    public ConcreteMediator() {
        this.kolleegat = new ArrayList<>();
    }
    
    

    @Override
    public void uusiTapahtuma(Kolleega ilmoittaja, String tapahtuma, double data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tiedotaMuutos(String muutos, double data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lisaaKolleega(Kolleega kolleega) {
        this.kolleegat.add(kolleega);
    }
}
