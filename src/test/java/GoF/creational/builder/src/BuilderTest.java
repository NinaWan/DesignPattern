package GoF.creational.builder.src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    private Director tested;
    private Builder builder;
    private Product expected1;
    private Product expected2;

    @BeforeEach
    void setUp() {
        expected1 = new Product(1, "1", 1L);
        expected2 = new Product(2, "2", 2L);
    }

    @Test
    public void test1() {
        builder = new ConcreteBuilder1();
        tested = new Director(builder);
        tested.construct();
        assertSameProduct(builder.getProduct(), expected1);
    }

    @Test
    public void test2() {
        builder = new ConcreteBuilder2();
        tested = new Director(builder);
        tested.construct();
        assertSameProduct(builder.getProduct(), expected2);
    }

    private void assertSameProduct(Product actual, Product expected) {
        assertEquals(actual.getPartA(), expected.getPartA());
        assertEquals(actual.getPartB(), expected.getPartB());
        assertEquals(actual.getPartC(), expected.getPartC());
    }
}