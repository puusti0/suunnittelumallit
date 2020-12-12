package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;

public interface CharacterState {
    
    public void attackOne(Pokemon p);
    
    public void attackTwo(Pokemon p);
    
    public void attackThree(Pokemon p);
    
    public void evolve(Pokemon p);
    
    public void accept(Visitor visitor);
    
    public void addXp(int xp);
    
}
