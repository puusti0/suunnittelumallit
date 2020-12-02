package suunnittelumallit.mediator;


public interface Mediator {
    
    public void uusiTapahtuma(Kolleega ilmoittaja, String tapahtuma, double data);
    
    public void tiedotaMuutos(String muutos, double data);
    
    void lisaaKolleega(Kolleega kolleega);
}
