package GoF.structural.adapter.src;

public class AdapterClass extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
