package adapter.composition;

public class Adapter implements Client {

    private Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void request() {
        service.specificRequest();
    }
}
