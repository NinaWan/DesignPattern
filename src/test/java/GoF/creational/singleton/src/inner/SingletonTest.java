package GoF.creational.singleton.src.inner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertSame(singleton1, singleton2);
    }
}