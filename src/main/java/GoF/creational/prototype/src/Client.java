package GoF.creational.prototype.src;

public class Client {
    private final PrototypeCreator prototypeCreator = new PrototypeCreator();

    public Prototype createConcretePrototype1() throws CloneNotSupportedException {
        return prototypeCreator.createPrototype("ConcretePrototype1");
    }

    public Prototype createConcretePrototype2() throws CloneNotSupportedException {
        return prototypeCreator.createPrototype("ConcretePrototype2");
    }
}

