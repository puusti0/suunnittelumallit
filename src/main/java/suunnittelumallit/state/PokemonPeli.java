package suunnittelumallit.state;

public class PokemonPeli {
    
    public static void main(String[] args) {
        
        Pokemon tulilisko = new Pokemon();
        
        for (int i=0; i<10; i++) {
            tulilisko.tuliIsku();
            tulilisko.hantaIsku();
            tulilisko.nyrkkiIsku();
        }
    }
}
