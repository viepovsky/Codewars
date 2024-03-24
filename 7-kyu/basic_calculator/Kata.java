package basic_calculator;

class Kata {
    static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        Double result = switch (operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            case "/" -> numberTwo != 0 ? numberOne / numberTwo : null;
            default -> null;
        };
        return result != null ? result == 0.0 ? 0.0 : result : null;
    }
}
