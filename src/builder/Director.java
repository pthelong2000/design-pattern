package builder;

public class Director {
    public Product buildProduct(ProductBuilder builder) {
        return builder.build();
    }
}