package cat_years_dog_years;

class Dinglemouse {
    static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = calculatePetYears(humanYears, 4);
        int dogYears = calculatePetYears(humanYears, 5);
        return new int[]{humanYears, catYears, dogYears};
    }
    private static int calculatePetYears(int humanYears, int additional) {
        return humanYears > 2 ? 15 + 9 + (humanYears - 2) * additional : humanYears > 1 ? 15 + 9 : 15;
    }
}
