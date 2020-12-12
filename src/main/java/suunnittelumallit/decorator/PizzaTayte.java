package suunnittelumallit.decorator;

public abstract class PizzaTayte implements Pizza {
    private final Pizza tayte;
    private double hinta;

    public PizzaTayte(Pizza tayte) {
        this.tayte = tayte;
    }
    
    
    @Override
    public double getHinta() {
        return tayte.getHinta();
    }

    @Override
    public String getKuvaus() {
        return tayte.getKuvaus();
    }
}