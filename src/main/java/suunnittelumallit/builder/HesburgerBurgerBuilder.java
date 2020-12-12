package suunnittelumallit.builder;

import java.util.ArrayList;
import java.util.List;


public class HesburgerBurgerBuilder extends BurgerBuilder {
    private List<Ainesosa> burgeri;
    private final String tyyppi;

    public HesburgerBurgerBuilder() {
        this.tyyppi = "Hese";
    }

    @Override
    public String getTyyppi() {
        return tyyppi;
    }
    

    @Override
    public List<Ainesosa> getBurger() {
        return this.burgeri;
    }

    @Override
    public void createBurger() {
        this.burgeri = new ArrayList<>();
        addSampyla();
    }

    @Override
    public void addSalaatti() {
        this.burgeri.add(new JaavuoriSalaatti());
    }

    @Override
    public void addSipuli() {
        this.burgeri.add(new Sipuli());
    }

    @Override
    public void addKetsuppi() {
        this.burgeri.add(new Ketsuppi());
    }

    @Override
    public void addPekoni() {
        this.burgeri.add(new Pekoni());
    }

    @Override
    public void addPihvi() {
        this.burgeri.add(new Pihvi());
    }

    @Override
    public void addKanaPihvi() {
        this.burgeri.add(new KanaPihvi());
    }
    

    @Override
    public void addSampyla() {
        this.burgeri.add(new Sampyla());
    }

    @Override
    public void addTomaatti() {
        this.burgeri.add(new Tomaatti());
    }
}
