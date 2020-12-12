package suunnittelumallit.decorator;


public class Smetana extends PizzaTayte {
    private final double hinta = 1.5;

    public Smetana(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " smetanaa,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    } 
}