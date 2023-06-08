package eliminate_the_intruders_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetBitsTest {
    SetBits sb = new SetBits();
    @Test
    public void sampleTests() {
        assertEquals(sb.eliminateUnsetBits("11010101010101"), 255);
        assertEquals(sb.eliminateUnsetBits("111"), 7);
        assertEquals(sb.eliminateUnsetBits("1000000"), 1);
    }
}
