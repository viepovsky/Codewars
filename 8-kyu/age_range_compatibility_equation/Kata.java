package age_range_compatibility_equation;

class Kata {
    private final static float CONSTANT = 0.1f;
    static String datingRange(int age) {
        return age <= 14 ? calculateAgeForYouth(age) : calculateAgeForOlder(age);
    }

    private static String calculateAgeForYouth(int age) {
        float value = CONSTANT * age;
        return (int)(age - value) + "-" + (int)(age + value);
    }

    private static String calculateAgeForOlder(int age) {
        return age / 2 + 7 + "-" + (age - 7) * 2;
    }
}
