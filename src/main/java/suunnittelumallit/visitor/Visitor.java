package suunnittelumallit.visitor;

import suunnittelumallit.visitor.state.StateOne;
import suunnittelumallit.visitor.state.StateThree;
import suunnittelumallit.visitor.state.StateTwo;


public interface Visitor {
    void visit(StateOne pokemon);
    void visit(StateTwo pokemon);
    void visit(StateThree pokemon);
}
