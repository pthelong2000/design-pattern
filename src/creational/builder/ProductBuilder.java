package creational.builder;

public interface ProductBuilder {
    ProductBuilder setField1(String field1);
    ProductBuilder setField2(int field2);
    Product build();
}
