package GoF.creational.singleton.src.enumeration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetInstance() {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        assertSame(singleton1, singleton2);
    }
}