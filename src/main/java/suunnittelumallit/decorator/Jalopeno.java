package suunnittelumallit.decorator;


public class Jalopeno extends PizzaTayte {
    private final double hinta = 0.8;

    public Jalopeno(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " jalopenoa,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    } 
}