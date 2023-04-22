package GoF.creational.prototype.src;

public class ConcretePrototype2 extends Prototype {
    private int numOfClones;

    public ConcretePrototype2() {
        numOfClones = 0;
        name = "ConcretePrototype2";
    }

    @Override
    public ConcretePrototype2 clone() throws CloneNotSupportedException {
        ConcretePrototype2 copy = (ConcretePrototype2) super.clone();
        copy.setName(copy.getName() + "-" + (numOfClones++));
        return copy;
    }
}
