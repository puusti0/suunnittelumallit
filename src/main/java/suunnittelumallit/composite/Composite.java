package suunnittelumallit.composite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Composite {
    public static void main(String[] args) {
        
        Class luokka = null;
        Manufacturer komponenttiTehdas = null;
        Properties asetukset = new Properties();
        
        try {
            asetukset.load(new FileInputStream("src/main/resources/factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            luokka = Class.forName(asetukset.getProperty("factory"));
            komponenttiTehdas = (Manufacturer)luokka.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}