package suunnittelumallit.builder;


public class Tarjoilija {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Object getBurger() {
        return this.burgerBuilder.getBurger();
    }
    
    
    public void teeTilaus(Tilaus tilaus) {
        burgerBuilder.createBurger();
        for (String ainesosa : tilaus.getTilaus()) {
            switch (ainesosa) {
                case "Sa":
                    burgerBuilder.addSalaatti();
                    break;
                case "Kp":
                    burgerBuilder.addKanaPihvi();
                    break;
                case "Ke":
                    burgerBuilder.addKetsuppi();
                    break;
                case "Pe":
                    burgerBuilder.addPekoni();
                    break;
                case "P":
                    burgerBuilder.addPihvi();
                    break;
                case "Säm":
                    burgerBuilder.addSampyla();
                    break;
                case "Si":
                    burgerBuilder.addSipuli();
                    break;
                case "To":
                    burgerBuilder.addTomaatti();
                    break;
                default:
                    break;
            }
        }
    }
    
}
