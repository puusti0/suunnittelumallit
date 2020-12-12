package suunnittelumallit.visitor.state;

import suunnittelumallit.visitor.Visitor;


public class Venusaur extends StateThree {

    @Override
    public void addXp(int xp) {
        super.addXp(xp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accept(Visitor visitor) {
        super.accept(visitor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evolve(Pokemon p) {
        super.evolve(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackThree(Pokemon p) {
        System.out.println("Venusaur döppäili");
        super.attackThree(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackTwo(Pokemon p) {
        System.out.println("Venusaur dappaili");
        super.attackTwo(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackOne(Pokemon p) {
        System.out.println("Venusaur dippaili");
        super.attackOne(p); //To change body of generated methods, choose Tools | Templates.
    }
}
