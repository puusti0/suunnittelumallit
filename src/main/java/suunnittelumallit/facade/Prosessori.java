package suunnittelumallit.facade;

public class Prosessori {

    private final Muisti ram;
    private final Kovalevy hdd;
    private int osoitin;

    public Prosessori(Muisti ram, Kovalevy hdd) {
        this.ram = ram;
        this.hdd = hdd;
        this.osoitin = 0;
    }

    public void freeze() {
        System.out.println("System freeze.....");
    }

    public void jump(int sijainti) {
        this.osoitin = sijainti;
        System.out.println("Siirretty muistiosoitin sijaintiin: " + this.osoitin);
    }

    public void suorita() {
        while (this.osoitin < this.ram.getKoko()) {
            if (this.ram.getRekisteri(osoitin) == '$') {
                buutti();
                break;
            } else {
                System.out.println("Ladattiin muistiosoitteesta [" + this.osoitin + "] merkki: " + this.ram.getRekisteri(osoitin));
            }
            this.osoitin++;
        }
    }

    public void suorita(int kaskyjenMaara) {
        if (this.osoitin + kaskyjenMaara > this.ram.getKoko()) {
            suorita();
        } else {
            while (this.osoitin < kaskyjenMaara) {
                if (this.ram.getRekisteri(osoitin) == '$') {
                    buutti();
                    break;
                } else {
                    System.out.println("Ladattiin muistiosoitteesta [" + this.osoitin + "] merkki: " + this.ram.getRekisteri(osoitin));
                }
                this.osoitin++;
            }
        }
    }

    private void buutti() {
        while (this.osoitin < this.ram.getKoko()) {
            if (this.ram.getRekisteri(osoitin) == '$') {
                System.out.println("ALOITETAAN TIETOKONEEN KÄYNNISTYS: ");
            } else if (this.ram.getRekisteri(osoitin) == '-') {
                System.out.print(" ");
            } else if (this.ram.getRekisteri(osoitin) == '+') {
                System.out.println("");
            } else if (this.ram.getRekisteri(osoitin) == '#') {
                System.out.println("");
                System.out.println("KÄYNNISTYS OPERAATIOT SUORITETTU.");
                break;
            } else {
                System.out.print(this.ram.getRekisteri(osoitin));
            }
            this.osoitin++;
        }
    }
}
