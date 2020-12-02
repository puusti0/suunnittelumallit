package suunnittelumallit.composite.kingston;

import suunnittelumallit.composite.Component;
import suunnittelumallit.composite.Manufacturer;


public class KingstonFactory implements Manufacturer{
    private double priceMultiplier;

    public KingstonFactory(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
    
    public KingstonFactory() {
        this(1);
    }

    @Override
    public Component createComponent(String name, double price) {
        return new KingstonComponent(this.priceMultiplier*price, name);
    }

    @Override
    public void setPriceMultiplier(double multiplier) {
        this.priceMultiplier = multiplier;
    }
    
}
