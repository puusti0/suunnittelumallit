package suunnittelumallit.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import suunnittelumallit.singleton.adidas.AdidasTehdas;
import suunnittelumallit.singleton.boss.BossTehdas;

public class AbstractFactory {

    public static void main(String[] args) {

        VaateTehdas vaateTehdas = null;
        Properties asetukset = new Properties();
        
        try {
            asetukset.load(new FileInputStream("src/main/resources/tehdas.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        switch(asetukset.getProperty("vaateTehdas")) {
            case "Boss":
                vaateTehdas = BossTehdas.getInstance();
                break;
            case "Adidas":
                vaateTehdas = AdidasTehdas.getInstance();
                break;
            default:
                System.out.println("Ei löytynyt!"); 
        }
        
        Koodaaja koodari = new Koodaaja("Jasper", vaateTehdas);
        koodari.esittaydy();
    }
}