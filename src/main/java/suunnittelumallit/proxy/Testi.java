package suunnittelumallit.proxy;

import java.util.ArrayList;
import java.util.List;

public class Testi {

    public static void main(String[] args) {

        List<Image> kuvaLista = new ArrayList<>();
        kuvaLista.add(new ProxyImage("Kissakuva"));
        kuvaLista.add(new ProxyImage("Koirakuva"));
        kuvaLista.add(new ProxyImage("Heppakuva"));
        kuvaLista.add(new ProxyImage("Kanikuva"));
        kuvaLista.add(new ProxyImage("Vuohikuva"));

        System.out.println("Hakemiston kuvat:");
        kuvaLista.forEach(image -> {
            image.showData();
        });

        System.out.println("Avataan hakemisto ja näytetään kuvat...");
        kuvaLista.forEach(image -> {
            image.displayImage();
        });
    }
}