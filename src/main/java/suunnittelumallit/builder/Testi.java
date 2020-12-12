package suunnittelumallit.builder;

import java.util.List;


public class Testi {
    
    public static void main(String[] args) {
        
        Tarjoilija tarjoilija = new Tarjoilija();
        BurgerBuilder mc = new McDonaldsBurgerBuilder();
        BurgerBuilder hese = new HesburgerBurgerBuilder();
        
        tarjoilija.setBurgerBuilder(mc);
        Tilaus tilaus = new Tilaus();
        tilaus.addAines("Sa");
        tilaus.addAines("Kp");
        tilaus.addAines("Ke");
        tilaus.addAines("Si");
        tarjoilija.teeTilaus(tilaus);
        Object mcHamppari = tarjoilija.getBurger();
        
        System.out.println("Tilattu hampurilainen, joka sisältää:");
        System.out.println(mcHamppari);
        
        System.out.println("");
        System.out.println("");
        
        
        tarjoilija.setBurgerBuilder(hese);
        Tilaus tilaus2 = new Tilaus();
        tilaus2.addAines("Sa");
        tilaus2.addAines("P");
        tilaus2.addAines("Pe");
        tilaus2.addAines("Ke");
        tilaus2.addAines("Si");
        tilaus2.addAines("To");
        tarjoilija.teeTilaus(tilaus2);
        List<Ainesosa> heseHamppari = (List<Ainesosa>)tarjoilija.getBurger();
        
        System.out.println("Tilattu hampurilainen, joka sisältää:");
        heseHamppari.forEach(osa -> {
            System.out.println(osa.toString());
        });
    }
    
}
