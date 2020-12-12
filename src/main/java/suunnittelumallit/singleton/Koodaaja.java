package suunnittelumallit.singleton;

public class Koodaaja {
    private String nimi;
    private Paita paita;
    private Housut housut;
    private Kengat kengat;
    private Hattu hattu;

    public Koodaaja(String nimi, VaateTehdas vaatetehdas) {
        this.nimi = nimi;
        this.hattu = vaatetehdas.createHattu();
        this.housut = vaatetehdas.createHousut();
        this.kengat = vaatetehdas.createKengat();
        this.paita  = vaatetehdas.cretePaita();
    }
    
    public void esittaydy() {
        System.out.println(String.format("Hei olen %s ja päässäni on %s, päälläni on %s sekä %s ja jalassani on %s",
                this.nimi, this.hattu, this.paita, this.housut, this.kengat));
    }
}
