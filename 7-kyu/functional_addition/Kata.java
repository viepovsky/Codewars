package functional_addition;

import java.util.function.IntUnaryOperator;

class Kata {
    static IntUnaryOperator add(int n) {
        return operand -> operand + n;
    }
}
