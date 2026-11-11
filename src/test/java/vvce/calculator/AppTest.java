package vvce.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testEven() {
        assertEquals("Even", App.checkEvenOdd(10));
    }

    @Test
    void testOdd() {
        assertEquals("Odd", App.checkEvenOdd(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", App.checkEvenOdd(0));
    }
}
