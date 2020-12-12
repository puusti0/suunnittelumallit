package suunnittelumallit.iterator;

import java.util.ArrayList;

public class LisaavaSaie extends Saie{
    private final ArrayList<Integer> lista;
    private final String nimi;
    private final int lisaa;

    public LisaavaSaie(ArrayList<Integer> lista, String nimi, int lisaa) {
        this.nimi = nimi;
        this.lista = lista;
        this.lisaa = lisaa;
    }

    @Override
    public void run() {
        for (int i=0; i<this.lisaa; i++) {
            lista.add(i*3);
        }
    } 
}