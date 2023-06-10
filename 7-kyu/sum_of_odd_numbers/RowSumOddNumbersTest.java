package sum_of_odd_numbers;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RowSumOddNumbersTest {
    @Test
    void test1() {
        Random rnd = new Random();
        for(int i=0;i<50;i++){
            int n = rnd.nextInt(500)+1;
            assertEquals((int) Math.pow(n,3), RowSumOddNumbers.rowSumOddNumbers(n));
        }
    }
}
