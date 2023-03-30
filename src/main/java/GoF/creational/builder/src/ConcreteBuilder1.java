package GoF.creational.builder.src;

public class ConcreteBuilder1 extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA(1);
    }

    @Override
    public void buildPartB() {
        product.setPartB("1");
    }

    @Override
    public void buildPartC() {
        product.setPartC(1L);
    }
}
