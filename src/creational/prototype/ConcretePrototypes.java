package creational.prototype;

public class ConcretePrototypes implements Prototype {

    @Override
    public ConcretePrototypes clone() {
        return new ConcretePrototypes();
    }

    @Override
    public void run() {
        System.out.println("run creational.prototype");
    }
}