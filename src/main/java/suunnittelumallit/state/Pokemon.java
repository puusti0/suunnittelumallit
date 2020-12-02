package suunnittelumallit.state;

public class Pokemon {
    private CharacterState pokemonState;
    private int pokemonXp;

    public Pokemon() {
        pokemonState = new CharacterStateFirst();
        pokemonXp = 0;
    }

    public int getXp() {
        return pokemonXp;
    }
    
    public void setXp(int xp) {
        pokemonXp = xp;
        
        if (pokemonXp > 40) {
            pokemonState.evolve(this);
            pokemonXp = 0;
        }
    }

    public void setState(CharacterState state) {
        pokemonState = state;
    }
    
    public void tuliIsku() {
        pokemonState.attackFire(this);
    }
    
    public void nyrkkiIsku() {
        pokemonState.attackPunch(this);
    }
    
    public void hantaIsku() {
        pokemonState.attackTail(this);
    }
}
