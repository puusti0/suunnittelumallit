package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.PokemonVisitor;
import suunnittelumallit.visitor.Visitor;

public class PokemonPeli {
    
    public static void main(String[] args) {
        
        Pokemon tulilisko = new Cha();
        Pokemon saur = new Saur();
        Visitor visitor = new PokemonVisitor();
        
        for (int i=0; i<2; i++) {
            tulilisko.iskuYksi();
            tulilisko.iskuKolme();
            tulilisko.iskuKaksi();
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Tuliliskolla on " + tulilisko.getXp() + " xp.");
        System.out.println("Vihersuruksella on " + saur.getXp() + " xp.");
        
        for (int i=0; i<3; i++) {
            saur.getPokemonState().accept(visitor);
            tulilisko.getPokemonState().accept(visitor);
        }
        
        System.out.println("");
        System.out.println("");
        tulilisko.iskuKaksi();
        saur.iskuKolme();
        
        System.out.println("Tuliliskolla on " + tulilisko.getXp() + " xp.");
        System.out.println("Vihersuruksella on " + saur.getXp() + " xp.");
        
    }
}
