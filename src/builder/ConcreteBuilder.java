package builder;

public class ConcreteBuilder implements ProductBuilder {

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product("value", 50);
    }

    @Override
    public ProductBuilder setField1(String field1) {
        this.product.setField1(field1);
        return this;
    }

    @Override
    public ProductBuilder setField2(int field2) {
        this.product.setField2(field2);
        return this;
    }

    @Override
    public Product build() {
        return this.product;
    }
}