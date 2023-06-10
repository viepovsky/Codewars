package the_office_1_outed;

import java.util.Arrays;

class TheOffice {
    static String outed(Person[] meet, String boss) {
        int sum = Arrays.stream(meet).map(n -> {
            if (n.name.equals(boss)) {
                return n.happiness * 2;
            } else {
                return n.happiness;
            }
        }).mapToInt(Integer::intValue).sum();
        return sum / (double)meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}
