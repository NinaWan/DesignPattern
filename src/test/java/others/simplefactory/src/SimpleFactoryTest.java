package others.simplefactory.src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleFactoryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Client tested;
    private String expectedOutput1;
    private String expectedOutput2;

    @BeforeEach
    void setUp() {
        tested = new Client();
        expectedOutput1 = "ConcreteProduct1::method1\nConcreteProduct1::method2\n";
        expectedOutput2 = expectedOutput1 + "ConcreteProduct2::method1\nConcreteProduct2::method2\n";
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMethod() {
        tested.method("1");
        assertEquals(expectedOutput1, outContent.toString());
        tested.method("2");
        assertEquals(expectedOutput2, outContent.toString());
    }
}