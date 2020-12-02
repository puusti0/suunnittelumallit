package suunnittelumallit.state;

public abstract class CharacterState {
    
    public abstract void attackFire(Pokemon p);
    
    public abstract void attackTail(Pokemon p);
    
    public abstract void attackPunch(Pokemon p);
    
    public abstract void evolve(Pokemon p);
}
