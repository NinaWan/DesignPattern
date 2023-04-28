package GoF.structural.adapter.src;

public class Client {
    public void adapterObject() {
        Target target = new AdapterObject(new Adaptee());
        target.request();
    }

    public void adapterClass() {
        Target target = new AdapterClass();
        target.request();
    }
}
