package suunnittelumallit.composite;


public interface Manufacturer {
    
    public Component createComponent(String name, double price);
    
    public void setPriceMultiplier(double multiplier);
    
}
