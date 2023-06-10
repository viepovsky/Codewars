package multiples_of_3_or_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test() {
        assertEquals(23, new Kata().solution(10));
    }
}
