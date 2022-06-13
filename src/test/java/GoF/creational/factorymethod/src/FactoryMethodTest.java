package GoF.creational.factorymethod.src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FactoryMethodTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private String expectedOutput1;
    private String expectedOutput2;

    @BeforeEach
    void setUp() {
        expectedOutput1 = "ConcreteProduct1::method1\nConcreteProduct1::method2\n";
        expectedOutput2 = expectedOutput1 + "ConcreteProduct2::method1\nConcreteProduct2::method2\n";
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testCreateProduct() {
        Creator tested = new ConcreteCreator1();
        assertInstanceOf(ConcreteProduct1.class, tested.createProduct());
        tested.method();
        assertEquals(expectedOutput1, outContent.toString());

        tested = new ConcreteCreator2();
        assertInstanceOf(ConcreteProduct2.class, tested.createProduct());
        tested.method();
        assertEquals(expectedOutput2, outContent.toString());
    }
}