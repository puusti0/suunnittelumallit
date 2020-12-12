package suunnittelumallit.builder;

import java.util.ArrayList;
import java.util.List;

public class Tilaus {
    private List<String> tilaus;

    public Tilaus() {
        this.tilaus = new ArrayList<>();
    }
    
    public void addAines(String aines) {
        this.tilaus.add(aines);
    }
    
    public List<String> getTilaus() {
        return this.tilaus;
    }
}
