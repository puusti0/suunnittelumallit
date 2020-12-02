package suunnittelumallit.mediator;

public class Hyppy {
    private final double pituusPts;
    private final double tyyliPts;

    public Hyppy(double pituusPts, double tyyliPts) {
        this.pituusPts = pituusPts;
        this.tyyliPts = tyyliPts;
    }

    public double getPituusPts() {
        return pituusPts;
    }

    public double getTyyliPts() {
        return tyyliPts;
    }

    @Override
    public String toString() {
        return "Pituuspisteet: " + this.pituusPts + ", Tyylipisteet: " + this.tyyliPts;
    }
}
