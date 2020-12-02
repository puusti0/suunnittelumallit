package suunnittelumallit.composite.kingston;

import suunnittelumallit.composite.Component;


public class KingstonComponent implements Component {
    private final double price;
    private final String name;

    public KingstonComponent(double price, String name) {
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
