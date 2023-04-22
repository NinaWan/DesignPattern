package GoF.creational.prototype.src;

public abstract class Prototype implements Cloneable {
    protected String name;
    protected String description;

    public Prototype() {
        name = "";
        description = "";
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype copy = (Prototype) super.clone();
        copy.setName(name);
        return copy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
