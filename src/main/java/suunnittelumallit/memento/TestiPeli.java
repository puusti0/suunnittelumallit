package suunnittelumallit.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestiPeli {
    
    public static void main(String[] args) {
        //Arvotun ja arvattavan luvun yläraja
        int raja = 30;
        Arvuuttaja arvuuttaja = new Arvuuttaja(raja);
        List<CareTaker> pelaajat = new ArrayList<>();
        Random arpoja = new Random();
        
        for (int i=0; i<40; i++) {
            CareTaker pelaaja = new CareTaker();
            pelaaja.aloitaPeli(arvuuttaja);
            pelaajat.add(pelaaja);
        }
        
        for (CareTaker pelaaja : pelaajat) {
            int arvaus = arpoja.nextInt(raja);
            Boolean osuiko = pelaaja.arvaa(arvuuttaja, arvaus);
            
            if (osuiko) {
                System.out.println("Pelaaja arvasi oikein! Arvaus: " + arvaus);
            } else {
                System.out.println("Pelaaja arvasi väärin! Arvaus: " + arvaus);
            }
        }   
    }
}
