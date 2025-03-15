package structural.proxy.virtual_proxy;

public class VirtualProxyDemo {
    public static void main(String[] args) {
        // Create a virtual proxy for a high-resolution image
        Image image = new ProxyImage("example.jpg");

        // Image is not loaded yet
        System.out.println("Image will be loaded only when display() is called.");

        // Image is loaded and displayed
        image.display();

        // Image is already loaded, so it won't load again
        image.display();
    }
}
