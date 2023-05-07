package deodorant_evaporator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , Evaporator.evaporator(10, 10, 10));
    }
}
