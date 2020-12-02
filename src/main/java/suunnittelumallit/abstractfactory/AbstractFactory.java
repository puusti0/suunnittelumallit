package suunnittelumallit.abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AbstractFactory {

    public static void main(String[] args) {

        Class luokka = null;
        VaateTehdas vaateTehdas = null;
        Properties asetukset = new Properties();
        
        try {
            asetukset.load(new FileInputStream("src/main/resources/tehdas.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            luokka = Class.forName(asetukset.getProperty("vaateTehdas"));
            vaateTehdas = (VaateTehdas)luokka.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Koodaaja koodari = new Koodaaja("Jasper", vaateTehdas);
        koodari.esittaydy();
    }
}