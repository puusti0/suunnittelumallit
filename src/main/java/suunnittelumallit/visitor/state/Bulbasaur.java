package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;


public class Bulbasaur extends StateOne {
    
    @Override
    public void attackOne(Pokemon p) {
        System.out.println("Bulbasaur teki sitä");
        super.attackOne(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackThree(Pokemon p) {
        System.out.println("Bulbasaur teki sitä ja tätä");
        super.attackThree(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackTwo(Pokemon p) {
        System.out.println("Bulbasaur teki tätä");
        super.attackTwo(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evolve(Pokemon p) {
        p.setState(new Ivysaur());
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
