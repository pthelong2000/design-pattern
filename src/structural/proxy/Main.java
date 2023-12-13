package structural.proxy;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.txt");
        image.display();
        image.display();
    }
}
