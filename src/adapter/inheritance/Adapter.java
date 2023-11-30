package adapter.inheritance;

public class Adapter extends Service implements Client {

    @Override
    public void request() {
        specificRequest();
    }
}
