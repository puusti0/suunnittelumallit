package suunnittelumallit.state;

public class CharacterStateSecond extends CharacterState{
    
    @Override
    public void attackFire(Pokemon p) {
        System.out.println("Charmeleon puhalsi tulta");
        p.setXp(p.getXp()+10);
    }

    @Override
    public void attackTail(Pokemon p) {
        System.out.println("Charmeleon läimäytti hännällään");
        p.setXp(p.getXp()+10);
    }

    @Override
    public void attackPunch(Pokemon p) {
        System.out.println("Charmeleon löi tassullaan");
        p.setXp(p.getXp()+10);
    }  

    @Override
    public void evolve(Pokemon p) {
         p.setState(new CharacterStateThird());
    }
}
