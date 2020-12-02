package suunnittelumallit.composite.evga;

import suunnittelumallit.composite.Component;
import suunnittelumallit.composite.Manufacturer;


public class EvgaFactory implements Manufacturer{
    
    private double priceMultiplier;
    
    public EvgaFactory(double multiplier) {
        this.priceMultiplier = multiplier;
    }

    public EvgaFactory() {
        this(1);
    }

    @Override
    public Component createComponent(String name, double price) {
        return new EvgaComponent(this.priceMultiplier*price, name);
    }

    @Override
    public void setPriceMultiplier(double multiplier) {
        this.priceMultiplier = multiplier;
    }   
}