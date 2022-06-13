package GoF.creational.factorymethod.src;

public class ConcreteCreator1 extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProduct1();
    }
}
