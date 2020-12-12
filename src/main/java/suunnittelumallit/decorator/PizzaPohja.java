package suunnittelumallit.decorator;


public class PizzaPohja implements Pizza {
    private final  double hinta = 2.0;
    
    @Override
    public double getHinta() {
        return this.hinta;
    }

    @Override
    public String getKuvaus() {
        return " pizza, joka sisältää:";
    } 
}
