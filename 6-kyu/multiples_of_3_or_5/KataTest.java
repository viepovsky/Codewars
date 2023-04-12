package multiples_of_3_or_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void test() {
        assertEquals(23, new Kata().solution(10));
    }
}
