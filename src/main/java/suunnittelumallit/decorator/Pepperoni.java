package suunnittelumallit.decorator;


public class Pepperoni extends PizzaTayte {
    private final double hinta = 1.7;

    public Pepperoni(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " pepperonia,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    } 
}
