package suunnittelumallit.visitor;

import suunnittelumallit.visitor.state.StateOne;
import suunnittelumallit.visitor.state.StateThree;
import suunnittelumallit.visitor.state.StateTwo;


public class PokemonVisitor implements Visitor {

    @Override
    public void visit(StateOne pokemon) {
        pokemon.addXp(10);
    }

    @Override
    public void visit(StateTwo pokemon) {
        pokemon.addXp(15);
    }

    @Override
    public void visit(StateThree pokemon) {
        pokemon.addXp(20);
    }  
}
