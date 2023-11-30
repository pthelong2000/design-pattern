package prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototypes();
        prototype.run();

        Prototype clonedPrototype = prototype.clone();
        clonedPrototype.run();
    }
}