package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;

public class Charizard extends StateThree {
    
    @Override
    public void attackOne(Pokemon p) {
        System.out.println("Charizard syöksi tulimyrskyn");
        super.attackOne(p);
    }

    @Override
    public void attackTwo(Pokemon p) {
        System.out.println("Charizard piiskasi hännällään");
        super.attackTwo(p);
    }

    @Override
    public void attackThree(Pokemon p) {
        System.out.println("Charizard tyrmäsi tassullaan");
        super.attackThree(p);
    }  

    @Override
    public void evolve(Pokemon p) {
        super.evolve(p);
    }

    @Override
    public void accept(Visitor visitor) {
        super.accept(visitor);
    }  

    @Override
    public void addXp(int xp) {
        super.addXp(xp);
    }
}
