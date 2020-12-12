package suunnittelumallit.decorator;


public class Ananas extends PizzaTayte {
    private final double hinta = 0.7;

    public Ananas(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " ananasta,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    }
}
