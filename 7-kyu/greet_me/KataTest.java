package greet_me;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTests() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }
}
