package suunnittelumallit.facade;

public class Kovalevy {

    private String data;

    public Kovalevy() {
        this.data = "Kovalevy-sisältää-kaikkea-tauhkaa.$Ladataan-piirisarjaajurit+Ladataan-näytönohjaimen-ajurit+Ladataan-verkkokortin-ajurit+Ladataan-usb-ajurit+Alustetaan-käyttöjärjestelmä#Täällä-on-taas-muuta-tauhkaa";
    }

    public void kirjoita(String data) {
        String tallennus = data.replace("\n", "+").replace("\r", "+");
        tallennus = tallennus.replace(" ", "-");
        this.data += tallennus;
    }

    public String lue(int aloitus, int koko) {
        StringBuilder sb = new StringBuilder();
        char[] dataTaulu = this.data.toCharArray();

        if ((aloitus + koko) < this.data.length()) {
            for (int i=aloitus; i < (aloitus+koko); i++) {
                sb.append(dataTaulu[i]);
            }
        } else {
            for (int i=aloitus; i < this.data.length(); i++) {
                sb.append(dataTaulu[i]);
            }
        }
        return sb.toString();
    }

    public int haeBuuttiSektoriAlku(char merkki) {
        return this.data.indexOf(merkki);
    }
}
