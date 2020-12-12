package suunnittelumallit.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Testi {
    
    public static ArrayList<Integer> populoiLista(int koko) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i=0; i<koko; i++) {
            lista.add(i);
        }
        return lista;
    }
    
    public static void main(String[] args) {
        //Tehtävä A alkaa
//        ArrayList<Integer> listaA = populoiLista(40);
//        
//        Iterator<Integer> iteraattoriA1 = listaA.iterator();
//        Iterator<Integer> iteraattoriA2 = listaA.iterator();
//        Saie saieYksi = new IteratorSaie(iteraattoriA1, "Säie A-1");
//        Saie saieKaksi = new IteratorSaie(iteraattoriA2, "Säie A-2");
//        
//        System.out.println("Tehtävä A)");
//        
//        saieYksi.start();
//        saieKaksi.start();
        //A loppuu
        
        
        
        //Tehtävä B alkaa
        ArrayList<Integer> listaB = populoiLista(60);

        Iterator<Integer> iteraattoriB = listaB.iterator();
        Saie saieYksi = new IteratorSaie(iteraattoriB, "Säie B-1");
        Saie saieKaksi = new IteratorSaie(iteraattoriB, "Säie B-2");
        
        System.out.println("Tehtävä B)");

        saieYksi.start();
        saieKaksi.start();
        //Tehtävä B loppuu
        
        
        
        //Tehtävä C alkaa
//        ArrayList<Integer> listaC = populoiLista(50);
//
//        Iterator<Integer> iteraattoriC = listaC.iterator();
//        Saie saieYksi = new IteratorSaie(iteraattoriC, "Säie C-1");
//        Saie saieKaksi = new LisaavaSaie(listaC, "Säie C-3", 20);
//        
//        System.out.println("Tehtävä C)");
//
//        saieYksi.start();
//        saieKaksi.start();
        //Tehtävä C loppuu
        
        
        //Tehtävä D alkaa
        //Tehtävä D loppuu
    }
}
