package suunnittelumallit.proxy;

public class ProxyImage implements Image {
    private RealImage image = null;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    
    @Override
    public void displayImage() {
        if (this.image == null) {
            this.image = new RealImage(this.filename);
        }
        image.displayImage();
    }


    @Override
    public void showData() {
        System.out.println("Image filename: " + this.filename + ".jpeg");
    }
}
