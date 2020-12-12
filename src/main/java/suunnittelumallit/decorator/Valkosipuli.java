package suunnittelumallit.decorator;


public class Valkosipuli extends PizzaTayte {
    private final double hinta = 0.2;

    public Valkosipuli(Pizza tayte) {
        super(tayte);
    }
    
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " valkosipulia,";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + this.hinta;
    } 
}