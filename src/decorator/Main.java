package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.description() + ": " + simpleCoffee.cost());

        Coffee milkCoffee = new MilkCoffee(new SimpleCoffee());
        System.out.println(milkCoffee.description() + ": " + milkCoffee.cost());
    }
}
