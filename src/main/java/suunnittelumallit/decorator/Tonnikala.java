package suunnittelumallit.decorator;


public class Tonnikala extends PizzaTayte {
    private final double hinta = 1.2;

    public Tonnikala(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " tonnikalaa,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    } 
}