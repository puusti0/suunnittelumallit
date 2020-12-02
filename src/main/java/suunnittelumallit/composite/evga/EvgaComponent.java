package suunnittelumallit.composite.evga;

import suunnittelumallit.composite.Component;


public class EvgaComponent implements Component{
    private final double price;
    private final String name;

    public EvgaComponent(double price, String name) {
        this.price = price;
        this.name = name;
    }
    
    @Override
    public double getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return "Evga " + this.name;
    }   
}