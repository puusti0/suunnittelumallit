package suunnittelumallit.memento;


public class CareTaker {
    private Object obj;
    
    public void aloitaPeli(Arvuuttaja arvuuttaja) {
        this.obj = arvuuttaja.liityPeliin();
    }
    
    public boolean arvaa(Arvuuttaja arvuuttaja, int arvaus) {
        return arvuuttaja.arvaa(this.obj, arvaus);
    }
}
