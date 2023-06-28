package make_function_that_does_arithmetic;

class ArithmeticFunction {
    static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "divide" -> a / b;
            default -> a * b;
        };
    }
}
