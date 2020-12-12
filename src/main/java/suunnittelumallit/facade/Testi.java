package suunnittelumallit.facade;


public class Testi {
    public static void main(String[] args) {
        ComputerFacade tietokone = new ComputerFacade();
        tietokone.lataaMuistiin(0, 0, 10);
        tietokone.suoritaKoodia(0, 10);
        tietokone.start();
    }
}
