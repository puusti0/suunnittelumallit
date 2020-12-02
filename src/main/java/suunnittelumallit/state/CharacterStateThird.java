package suunnittelumallit.state;

public class CharacterStateThird extends CharacterState{
    
    @Override
    public void attackFire(Pokemon p) {
        System.out.println("Charizard syöksi tulimyrskyn");
        p.setXp(p.getXp()+10);
    }

    @Override
    public void attackTail(Pokemon p) {
        System.out.println("Charizard piiskasi hännällään");
        p.setXp(p.getXp()+10);
    }

    @Override
    public void attackPunch(Pokemon p) {
        System.out.println("Charizard tyrmäsi tassullaan");
        p.setXp(p.getXp()+10);
    }  

    @Override
    public void evolve(Pokemon p) {
        p.setState(new CharacterStateFirst());
    } 
}
