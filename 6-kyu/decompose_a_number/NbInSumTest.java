package decompose_a_number;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NbInSumTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests decompose");
        long[][] ans = NbInSum.decompose(0);
        String ansStr = Arrays.toString(ans[0]) + Arrays.toString(ans[1]);
        testing(ansStr, "[][0]");
        ans = NbInSum.decompose(4);
        ansStr = Arrays.toString(ans[0]) + Arrays.toString(ans[1]);
        testing(ansStr, "[2][0]");
        ans = NbInSum.decompose(9);
        ansStr = Arrays.toString(ans[0]) + Arrays.toString(ans[1]);
        testing(ansStr, "[3][1]");
        ans = NbInSum.decompose(25);
        ansStr = Arrays.toString(ans[0]) + Arrays.toString(ans[1]);
        testing(ansStr, "[4, 2][0]");
        ans = NbInSum.decompose(45);
        ansStr = Arrays.toString(ans[0]) + Arrays.toString(ans[1]);
        testing(ansStr, "[5, 2][4]");
    }
}
