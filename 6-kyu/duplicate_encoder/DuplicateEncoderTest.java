package duplicate_encoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateEncoderTest {
    @Test
    void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
