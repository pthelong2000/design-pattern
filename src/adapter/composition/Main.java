package adapter.composition;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Client client = new Adapter(service);
        client.request();
    }
}
