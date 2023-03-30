package GoF.creational.builder.src;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA(2);
    }

    @Override
    public void buildPartB() {
        product.setPartB("2");
    }

    @Override
    public void buildPartC() {
        product.setPartC(2L);
    }
}
