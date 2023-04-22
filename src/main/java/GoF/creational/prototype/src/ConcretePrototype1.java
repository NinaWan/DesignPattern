package GoF.creational.prototype.src;

public class ConcretePrototype1 extends Prototype {
    private int numOfClones;

    public ConcretePrototype1() {
        numOfClones = 0;
        name = "ConcretePrototype1";
    }

    @Override
    public ConcretePrototype1 clone() throws CloneNotSupportedException {
        ConcretePrototype1 copy = (ConcretePrototype1) super.clone();
        copy.setName(copy.getName() + "-" + (numOfClones++));
        return copy;
    }
}
