package GoF.structural.adapter.src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    private Client tested;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private String expectedOutput;

    @BeforeEach
    void setUp() {
        tested = new Client();
        expectedOutput = "Adaptee::specificRequest\n";
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void adapterObject() {
        tested.adapterObject();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void adapterClass() {
        tested.adapterClass();
        assertEquals(expectedOutput, outContent.toString());
    }
}