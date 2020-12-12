package suunnittelumallit.builder;


public class McDonaldsBurgerBuilder extends BurgerBuilder {
    private StringBuilder burgeri;
    private final String tyyppi;
    
    public McDonaldsBurgerBuilder() {
        this.tyyppi = "Mc";
    }

    @Override
    public String getTyyppi() {
        return tyyppi;
    }
    

    @Override
    public String getBurger() {
        return this.burgeri.toString();
    }

    @Override
    public void createBurger() {
        this.burgeri = new StringBuilder();
        addSampyla();
    }

    @Override
    public void addSalaatti() {
        this.burgeri.append("Salaatti, ");
    }

    @Override
    public void addSipuli() {
        this.burgeri.append("Sipuli, ");
    }

    @Override
    public void addKetsuppi() {
        this.burgeri.append("Ketsuppi, ");
    }

    @Override
    public void addPekoni() {
        this.burgeri.append("Pekoni, ");
    }

    @Override
    public void addPihvi() {
        this.burgeri.append("Grillattu pihvi, ");
    }

    @Override
    public void addKanaPihvi() {
        this.burgeri.append("Broileripihvi, ");
    }

    @Override
    public void addSampyla() {
        this.burgeri.append("Sämpylä, ");
    }

    @Override
    public void addTomaatti() {
        this.burgeri.append("Tomaatti siivuja, ");
    }
    
}
