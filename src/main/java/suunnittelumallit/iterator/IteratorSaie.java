package suunnittelumallit.iterator;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IteratorSaie extends Saie {

    private final Iterator<Integer> it;
    private final String nimi;

    public IteratorSaie(Iterator<Integer> it, String nimi) {
        this.nimi = nimi;
        this.it = it;
    }

    @Override
    public void run() {
        while (this.it.hasNext()) {
            Integer luku = this.it.next();
            System.out.println(this.nimi + ": " + luku);
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(IteratorSaie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
