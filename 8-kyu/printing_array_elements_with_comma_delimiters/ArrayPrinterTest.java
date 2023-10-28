package printing_array_elements_with_comma_delimiters;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPrinterTest {
    @Test
    @DisplayName("Example test")
    void testInteger() {
        Integer[] array = new Integer[] { 2, 4, 5, 2 };
        assertEquals("2,4,5,2", ArrayPrinter.printArray(array), "Testing with: [2, 4, 5, 2]");
    }
}
