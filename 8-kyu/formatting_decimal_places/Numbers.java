package formatting_decimal_places;

class Numbers {
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.0;
    }
}
