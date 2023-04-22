package GoF.creational.prototype.src;

public class PrototypeCreator {
    private final Prototype concretePrototype1 = new ConcretePrototype1();
    private final Prototype concretePrototype2 = new ConcretePrototype2();

    public Prototype createPrototype(String type) throws CloneNotSupportedException {
        switch (type) {
            case "ConcretePrototype1":
                return concretePrototype1.clone();
            case "ConcretePrototype2":
                return concretePrototype2.clone();
            default:
                return null;
        }
    }
}
