package suunnittelumallit.facade;


public class ComputerFacade {
    private final Prosessori cpu;
    private final Muisti ram;
    private final Kovalevy hdd;

    public ComputerFacade() {
        this.ram = new Muisti(400);
        this.hdd = new Kovalevy();
        this.cpu = new Prosessori(this.ram, this.hdd);
    }
    
    public void start() {
        int buuttiOsoite = 8;
        cpu.freeze();
        ram.lataaMuistiin(buuttiOsoite, hdd.lue(hdd.haeBuuttiSektoriAlku('$'), 200));
        cpu.jump(buuttiOsoite);
        cpu.suorita();
    }
    
    public void suoritaKoodia(int osoitin, int maara) {
        cpu.jump(osoitin);
        cpu.suorita(maara);
    }
    
    public void lataaMuistiin(int osoite, int alku, int koko) {
        ram.lataaMuistiin(osoite, hdd.lue(alku, koko));
    }
}
