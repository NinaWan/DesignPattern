package GoF.creational.factorymethod.src;

public class ConcreteCreator2 extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProduct2();
    }
}
