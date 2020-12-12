package suunnittelumallit.memento;

import java.util.Random;

public class Arvuuttaja {

    private int luku;
    private final int raja;
    private final Random rand;

    public Arvuuttaja(int raja) {
        this.raja = raja;
        this.rand = new Random();
    }

    public Object liityPeliin() {
        this.luku = rand.nextInt(raja);
        return new Memento(this.luku);
    }
    
    public boolean arvaa(Object obj, int arvaus) {
        Memento memento = (Memento)obj;
        this.luku = memento.getTila();
        
        return luku == arvaus;
    } 
    
    private class Memento {
        private int tila;

        public Memento(int tila) {
            this.tila = tila;
        }

        public int getTila() {
            return tila;
        }
    }
}
