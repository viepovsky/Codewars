package find_the_unique_number;

import java.util.HashSet;

class Kata {
    static double findUniq(double arr[]) {
        HashSet<Double> newArr = new HashSet<>();
        HashSet<Double> notUnique = new HashSet<>();

        for (double value : arr) {
            if (!newArr.contains(value)) {
                newArr.add(value);
            } else {
                notUnique.add(value);
            }
        }
        newArr.removeAll(notUnique);
        return newArr.stream()
                     .findAny()
                     .orElse(0.0);
    }
}
