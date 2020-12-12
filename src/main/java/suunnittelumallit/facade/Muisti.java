package suunnittelumallit.facade;


public class Muisti {
    private final char muisti[];

    public Muisti(int koko) {
        this.muisti = new char[koko];
    }
    
    
    public void lataaMuistiin(int sijainti, String data) {
        if (data.length() <= this.muisti.length ) {
            for (int i=0, j=sijainti; i < data.length(); i++, j++) {
                this.muisti[j] = data.charAt(i);
            }
            System.out.println("Muistiin on ladattu uutta dataa " + data.length() + " merkkiä.");
        }
    }
    
    public char getRekisteri(int rekisteri) {
        return this.muisti[rekisteri];
    }
    
    public int getKoko() {
        return this.muisti.length;
    }
}
