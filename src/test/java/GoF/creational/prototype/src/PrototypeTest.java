package GoF.creational.prototype.src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {
    private Client tested;

    @BeforeEach
    void setUp() {
        tested = new Client();
    }

    @Test
    void createConcretePrototype1() throws CloneNotSupportedException {
        assertEquals("ConcretePrototype1-0", tested.createConcretePrototype1().getName());
        assertEquals("ConcretePrototype1-1", tested.createConcretePrototype1().getName());
    }

    @Test
    void createConcretePrototype2() throws CloneNotSupportedException {
        assertEquals("ConcretePrototype2-0", tested.createConcretePrototype2().getName());
        assertEquals("ConcretePrototype2-1", tested.createConcretePrototype2().getName());
    }
}