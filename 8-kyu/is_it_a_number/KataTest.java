package is_it_a_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    MyUtilities myUtil = new MyUtilities();

    @Test
    void test0() throws Exception
    {
        assertEquals(false,myUtil.isDigit("s2324"));
    }
    @Test
    void test1() throws Exception
    {
        assertEquals(true,myUtil.isDigit("-234.4"));
    }
}
