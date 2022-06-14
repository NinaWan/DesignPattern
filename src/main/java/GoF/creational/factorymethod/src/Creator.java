package GoF.creational.factorymethod.src;

public abstract class Creator {
    abstract Product createProduct(); // factory method

    public void method() {
        Product product = createProduct();
        product.method();
    }
}
