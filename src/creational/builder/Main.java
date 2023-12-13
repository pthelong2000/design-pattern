package creational.builder;

public class Main {
    public static void main(String[] args) {
        ProductBuilder productBuilder = new ConcreteBuilder();
        Product product = productBuilder.setField1("test").setField2(100).build();
        System.out.println(product);

        Director director = new Director();
        Product product1 = director.buildProduct(productBuilder);
        System.out.println(product1);
    }
}