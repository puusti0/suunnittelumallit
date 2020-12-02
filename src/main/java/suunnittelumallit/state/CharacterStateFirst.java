package suunnittelumallit.state;

public class CharacterStateFirst extends CharacterState{

    @Override
    public void attackFire(Pokemon p) {
        System.out.println("Charmander yski kipinöitä");
        p.setXp(p.getXp()+10);
    }

    @Override
    public void attackTail(Pokemon p) {
        System.out.println("Charmander heilautti häntäänsä");
        p.setXp(p.getXp()+10);
    }

    @Override
    public void attackPunch(Pokemon p) {
        System.out.println("Charmander tökkäsi tassullaan");
        p.setXp(p.getXp()+10);
    }  

    @Override
    public void evolve(Pokemon p) {
         p.setState(new CharacterStateSecond());
    }
}
