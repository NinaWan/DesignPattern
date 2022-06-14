package GoF.creational.abstractfactory.src;

public class Client {
    public void method1() {
        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.method();
        productB.method();
    }

    public void method2() {
        Factory factory = new ConcreteFactory2();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.method();
        productB.method();
    }
}
