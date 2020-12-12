package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;

public class Charmander extends StateOne {

    
    @Override
    public void attackOne(Pokemon p) {
        System.out.println("Charmander yski kipinöitä");
        super.attackOne(p);
    }

    @Override
    public void attackTwo(Pokemon p) {
        System.out.println("Charmander heilautti häntäänsä");
        super.attackTwo(p);
    }

    @Override
    public void attackThree(Pokemon p) {
        System.out.println("Charmander tökkäsi tassullaan");
        super.attackThree(p);
    }  

    @Override
    public void evolve(Pokemon p) {
         p.setState(new Charmeleon());
    }

    @Override
    public void accept(Visitor visitor) {
        super.accept(visitor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addXp(int xp) {
        super.addXp(xp);
    }
}
