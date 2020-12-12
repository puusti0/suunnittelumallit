package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;

public abstract class StateThree implements CharacterState {
    private int cachedXp;
    
    public StateThree() {
        this.cachedXp = 0;
    }

    @Override
    public void attackOne(Pokemon p) {
        p.setXp(p.getXp()+cachedXp+30);
        this.cachedXp = 0;
    }

    @Override
    public void attackTwo(Pokemon p) {
        p.setXp(p.getXp()+cachedXp+30);
        this.cachedXp = 0;
    }

    @Override
    public void attackThree(Pokemon p) {
        p.setXp(p.getXp()+cachedXp+30);
        this.cachedXp = 0;
    }

    @Override
    public void evolve(Pokemon p) {
        System.out.println("Tämä Pokemon ei voi enää kehittyä, mutta ansaitsit juuri Pokemonkehittäjä-palkinnon.");
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public void addXp(int xp) {
        this.cachedXp += xp;
    }
}
