package suunnittelumallit.mediator;


public class Hyppaaja extends Kolleega {
    private Hyppy[] pisteet;
    private int hyppyNro;
    private Mediator mediator;
    private String id;

    public Hyppaaja(Mediator mediator, String id) {
        super(mediator, id);
        this.pisteet = new Hyppy[2];
        this.hyppyNro = 0;
    }
    
    public void hyppaa() {
    }
    
    
    private void setPisteet(double pituusPisteet, double tyyliPisteet) {
        if (this.hyppyNro < 2) {
            this.pisteet[this.hyppyNro] = new Hyppy(pituusPisteet, tyyliPisteet);
        }
    }
    
    @Override
    public void notify(String muutos, double data) {
        if (muutos.equals("")) {
            
        }
    }
}
