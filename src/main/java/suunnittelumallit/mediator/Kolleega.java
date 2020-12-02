package suunnittelumallit.mediator;


public abstract class Kolleega {
    private Mediator mediator;
    private String id;

    public Kolleega(Mediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;          
    }
    
    public abstract void notify(String muutos, double data);
    
}
