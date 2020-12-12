package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;

public class Charmeleon extends StateTwo {

    
    @Override
    public void attackOne(Pokemon p) {
        System.out.println("Charmeleon puhalsi tulta");
        super.attackOne(p);
    }

    @Override
    public void attackTwo(Pokemon p) {
        System.out.println("Charmeleon läimäytti hännällään");
        super.attackTwo(p);
    }

    @Override
    public void attackThree(Pokemon p) {
        System.out.println("Charmeleon löi tassullaan");
        super.attackThree(p);
    }  

    @Override
    public void evolve(Pokemon p) {
         p.setState(new Charizard());
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
