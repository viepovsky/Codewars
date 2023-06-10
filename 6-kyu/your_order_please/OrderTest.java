package your_order_please;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    @Test
    void test1() {
        assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
    }

    @Test
    void test2() {
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", Order.order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
