package structural.proxy.virtual_proxy;

class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage; // Reference to the real object

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Lazy initialization: Create the real object only when needed
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
