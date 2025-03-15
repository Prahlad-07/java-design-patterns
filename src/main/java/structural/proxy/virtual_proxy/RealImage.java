package structural.proxy.virtual_proxy;

class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Simulate loading the image from disk
    }

    private void loadFromDisk() {
        System.out.println("Loading high-resolution image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}