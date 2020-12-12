package suunnittelumallit.visitor.state;

public abstract class Pokemon {
    private CharacterState pokemonState;
    private int pokemonXp;
    
    public Pokemon(CharacterState s) {
        pokemonState = s;
        pokemonXp = 0;
    }
    

    public int getXp() {
        return pokemonXp;
    }

    public CharacterState getPokemonState() {
        return pokemonState;
    }
    

    public void setXp(int xp) {
        pokemonXp = xp;

        if (pokemonState instanceof StateOne) {
            if (pokemonXp > 40) {
                pokemonState.evolve(this);
                pokemonXp = 0;
            }
        } else if (pokemonState instanceof StateTwo) {
            if (pokemonXp > 70) {
                pokemonState.evolve(this);
                pokemonXp = 0;
            }
        } else {
            if (pokemonXp > 100) {
                pokemonState.evolve(this);
                pokemonXp = 0;
            }
        }
    }

    public void setState(CharacterState state) {
        pokemonState = state;
    }

    public void iskuYksi() {
        pokemonState.attackOne(this);
    }

    public void iskuKaksi() {
        pokemonState.attackThree(this);
    }

    public void iskuKolme() {
        pokemonState.attackTwo(this);
    }
}
