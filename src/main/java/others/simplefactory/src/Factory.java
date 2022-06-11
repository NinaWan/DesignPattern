package others.simplefactory.src;

public class Factory {
    public static Product createProduct(String type) {
        if (type.equals("1")) {
            return new ConcreteProduct1();
        } else if (type.equals("2")) {
            return new ConcreteProduct2();
        }
        return null;
    }
}
