package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;

public abstract class StateTwo implements CharacterState {
    private int cachedXp;
    
    public StateTwo() {
        this.cachedXp = 0;
    }
    
    @Override
    public void attackOne(Pokemon p) {
        p.setXp(p.getXp()+cachedXp+20);
        this.cachedXp = 0;
    }

    @Override
    public void attackTwo(Pokemon p) {
        p.setXp(p.getXp()+cachedXp+20);
        this.cachedXp = 0;
    }

    @Override
    public void attackThree(Pokemon p) {
        p.setXp(p.getXp()+cachedXp+20);
        this.cachedXp = 0;
    }

    @Override
    public abstract void evolve(Pokemon p);
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void addXp(int xp) {
        this.cachedXp += xp;
    }
}
