import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator c = new Calculator();

    @Test
    void add() {
       assertEquals(4,c.add(2, 2));
    }

    @Test
    void dif() {
        assertEquals(2,c.dif(4, 2));
    }

    @Test
    void div() {
        assertEquals(2,c.div(4, 2));
    }

    @Test
    void times() {
        assertEquals(4,c.times(2, 2));
    }

    @Test
    void solver() {
        assertEquals(67,c.solver());
    }
}