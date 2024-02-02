package folding_your_way_to_the_moon;

class Kata {
    static Long fold(Double distance) {
        if (distance < 0) return null;
        double paperThickness = 0.0001;
        long foldTimes = 0L;
        while (distance > paperThickness) {
            paperThickness *= 2;
            foldTimes++;
        }
        return foldTimes;
    }
}
