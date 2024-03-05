package round_up_to_the_next_multiple_of_5;

class Kata {
    static int roundToNext5(int number) {
        int rest = number % 5;
        if (rest == 0) return number;
        return number < 0 ? number - rest : number - rest + 5;
    }
}
