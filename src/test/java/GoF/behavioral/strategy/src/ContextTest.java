package GoF.behavioral.strategy.src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {
    private Context tested;
    private ConcreteStrategy1 strategy1;
    private ConcreteStrategy2 strategy2;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        strategy1 = new ConcreteStrategy1();
        strategy2 = new ConcreteStrategy2();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void algorithm() {
        tested = new Context(strategy1);
        tested.algorithm();
        assertEquals("ConcreteStrategy1::algorithm\n", outContent.toString());

        outContent.reset();

        tested = new Context(strategy2);
        tested.algorithm();
        assertEquals("ConcreteStrategy2::algorithm\n", outContent.toString());
    }
}