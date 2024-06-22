package tip_calculator;

class Kata {
    static Integer calculateTip(double amount, String rating) {
        return switch (rating.toLowerCase()) {
            case "terrible" -> 0;
            case "poor" -> (int)Math.ceil(0.05 * amount);
            case "good" -> (int)Math.ceil(0.1 * amount);
            case "great" -> (int)Math.ceil(0.15 * amount);
            case "excellent" -> (int)Math.ceil(0.2 * amount);
            default -> null;
        };
    }
}
