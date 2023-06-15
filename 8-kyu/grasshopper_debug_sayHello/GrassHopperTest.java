package grasshopper_debug_sayHello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrassHopperTest {
    @Test
    void test1() {
        assertEquals("Hello, Mr. Spock",
                GrassHopper.sayHello("Mr. Spock"));
    }
    @Test
    void test2() {
        assertEquals("Hello, Captain Kirk",
                GrassHopper.sayHello("Captain Kirk"));
    }
    @Test
    void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrassHopper.sayHello("Liutenant Uhura"));
    }
    @Test
    void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrassHopper.sayHello("Dr. McCoy"));
    }
}
