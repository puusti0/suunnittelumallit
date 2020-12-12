package suunnittelumallit.decorator;


public class Tomaattikastike extends PizzaTayte {
    private final double hinta = 0.5;

    public Tomaattikastike(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " tomaattikastiketa,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    }
}
