package prototype;

public interface Prototype extends Cloneable {
    ConcretePrototypes clone();
    void run();
}