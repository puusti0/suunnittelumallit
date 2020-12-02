package suunnittelumallit.abstractfactory.adidas;

import suunnittelumallit.abstractfactory.Hattu;
import suunnittelumallit.abstractfactory.Housut;
import suunnittelumallit.abstractfactory.Kengat;
import suunnittelumallit.abstractfactory.Paita;
import suunnittelumallit.abstractfactory.VaateTehdas;


public class AdidasTehdas implements VaateTehdas {

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