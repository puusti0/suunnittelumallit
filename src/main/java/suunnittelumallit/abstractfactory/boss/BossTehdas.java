package suunnittelumallit.abstractfactory.boss;

import suunnittelumallit.abstractfactory.Hattu;
import suunnittelumallit.abstractfactory.Housut;
import suunnittelumallit.abstractfactory.Kengat;
import suunnittelumallit.abstractfactory.Paita;
import suunnittelumallit.abstractfactory.VaateTehdas;


public class BossTehdas implements VaateTehdas {

    @Override
    public Hattu createHattu() {
        return new BossSilinteri();
    }

    @Override
    public Paita cretePaita() {
        return new BossPaita();
    }

    @Override
    public Housut createHousut() {
        return new BossHousut();
    }

    @Override
    public Kengat createKengat() {
        return new BossKengat();
    }
}
