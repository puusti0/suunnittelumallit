package suunnittelumallit.visitor.state;

public class Saur extends Pokemon {

    public Saur() {
        super(new Bulbasaur());
    }


    @Override
    public void iskuKolme() {
        super.iskuKolme(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iskuKaksi() {
        super.iskuKaksi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iskuYksi() {
        super.iskuYksi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setState(CharacterState state) {
        super.setState(state); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setXp(int xp) {
        super.setXp(xp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getXp() {
        return super.getXp(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public CharacterState getPokemonState() {
        return super.getPokemonState(); //To change body of generated methods, choose Tools | Templates.
    } 
}
