package suunnittelumallit.singleton.adidas;

import suunnittelumallit.singleton.Hattu;
import suunnittelumallit.singleton.Housut;
import suunnittelumallit.singleton.Kengat;
import suunnittelumallit.singleton.Paita;
import suunnittelumallit.singleton.VaateTehdas;


public class AdidasTehdas implements VaateTehdas {
    
    private static AdidasTehdas INSTANCE = null;
    
    private AdidasTehdas() {
    }
    
    public static AdidasTehdas getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdidasTehdas();
        }
        return INSTANCE;
    }

    @Override
    public Hattu createHattu() {
        return new AdidasLippis();
    }

    @Override
    public Paita cretePaita() {
        return new AdidasPaita();
    }

    @Override
    public Housut createHousut() {
        return new AdidasHousut();
    }

    @Override
    public Kengat createKengat() {
        return new AdidasKengat();
    }
}