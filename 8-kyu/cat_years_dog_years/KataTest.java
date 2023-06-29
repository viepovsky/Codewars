package cat_years_dog_years;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void one() {
        assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

    @Test
    void two() {
        assertArrayEquals(new int[]{2,24,24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    }

    @Test
    void ten() {
        assertArrayEquals(new int[]{10,56,64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    }
}
