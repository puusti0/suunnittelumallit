package suunnittelumallit.singleton.boss;

import suunnittelumallit.singleton.Hattu;
import suunnittelumallit.singleton.Housut;
import suunnittelumallit.singleton.Kengat;
import suunnittelumallit.singleton.Paita;
import suunnittelumallit.singleton.VaateTehdas;


public class BossTehdas implements VaateTehdas {
    
    private static BossTehdas INSTANCE = null;
    
    private BossTehdas() {
    }
    
    public static BossTehdas getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BossTehdas();
        }
        return INSTANCE;
    }

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
