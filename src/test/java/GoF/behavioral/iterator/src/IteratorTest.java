package GoF.behavioral.iterator.src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    private Client tested;
    private Aggregate<Integer> nums;
    private Aggregate<String> strs;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private String expectedOutput;

    @BeforeEach
    void setUp() {
        nums = new ConcreteAggregate1<>(); // ArrayList
        for (int i = 1; i <= 3; i++) {
            nums.add(i);
        }

        strs = new ConcreteAggregate2<>(String.class, 3); // Array
        strs.add("a");
        strs.add("b");
        strs.add("c");

        tested = new Client(nums, strs);

        expectedOutput = "nums--------\n1\n2\n3\nstrs--------\na\nb\nc\n";
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void printElements() {
        tested.printElements();
        assertEquals(expectedOutput, outContent.toString());
    }
}