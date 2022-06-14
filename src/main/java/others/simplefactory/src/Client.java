package others.simplefactory.src;

public class Client {
    public void method(String type) {
        Product product = Factory.createProduct(type);
        assert product != null;
        product.method();
    }
}
