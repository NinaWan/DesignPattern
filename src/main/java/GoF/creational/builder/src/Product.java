package GoF.creational.builder.src;

public class Product {
    private int partA;
    private String partB;
    private long partC;

    public Product() {

    }

    public Product(int partA, String partB, long partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public int getPartA() {
        return partA;
    }

    public void setPartA(int partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public long getPartC() {
        return partC;
    }

    public void setPartC(long partC) {
        this.partC = partC;
    }
}
