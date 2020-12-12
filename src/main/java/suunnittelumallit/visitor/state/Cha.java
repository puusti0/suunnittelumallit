package suunnittelumallit.visitor.state;

public class Cha extends Pokemon {

    public Cha() {
        super(new Charmander());
    }

    @Override
    public void iskuKolme() {
        super.iskuKolme();
    }

    @Override
    public void iskuKaksi() {
        super.iskuKaksi();
    }

    @Override
    public void iskuYksi() {
        super.iskuYksi();
    }

    @Override
    public void setState(CharacterState state) {
        super.setState(state); 
    }

    @Override
    public void setXp(int xp) {
        super.setXp(xp);
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
