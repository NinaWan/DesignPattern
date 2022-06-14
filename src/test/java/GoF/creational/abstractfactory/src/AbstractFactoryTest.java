package GoF.creational.abstractfactory.src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractFactoryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Client tested;
    private String expectedOutput1;
    private String expectedOutput2;

    @BeforeEach
    void setUp() {
        tested = new Client();
        expectedOutput1 = "ConcreteProductA1::method\nConcreteProductB1::method\n";
        expectedOutput2 = "ConcreteProductA2::method\nConcreteProductB2::method\n";
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testFactory1() {
        tested.method1();
        assertEquals(expectedOutput1, outContent.toString());
    }

    @Test
    void testFactory2() {
        tested.method2();
        assertEquals(expectedOutput2, outContent.toString());
    }
}