package GoF.creational.builder.src;

public abstract class Builder {
    public Product product;

    public Builder() {
        product = new Product();
    }

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
