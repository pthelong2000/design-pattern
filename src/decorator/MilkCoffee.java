package decorator;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }

    @Override
    public String description() {
        return super.description() + " with milk";
    }
}
