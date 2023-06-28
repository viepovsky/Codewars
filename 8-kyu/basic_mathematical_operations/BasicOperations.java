package basic_mathematical_operations;

class BasicOperations {
    static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "/" -> v1 / v2;
            case "*" -> v1 * v2;
            default -> throw new IllegalArgumentException();
        };
    }
}
