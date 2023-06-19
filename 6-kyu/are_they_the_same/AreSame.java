package are_they_the_same;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AreSame {
    static boolean comp(int[] a, int[] b) {
        boolean areArraysSame = true;
        if (a == null ^ b == null) {
            areArraysSame = false;
        } else if (a != null) {
            if (a.length == b.length) {
                List<Integer> elA = Arrays.stream(a).boxed().toList();
                List<Integer> elB = new ArrayList<>(Arrays.stream(b).boxed().toList());
                for (Integer intA : elA) {
                    boolean isAnyBEqualToA = false;
                    for (int j = 0; j < elB.size(); j++) {
                        if (Math.pow(intA, 2) == elB.get(j)) {
                            elB.remove(j);
                            isAnyBEqualToA = true;
                            break;
                        }
                    }
                    if (!isAnyBEqualToA) {
                        areArraysSame = false;
                        break;
                    }
                }
            } else {
                areArraysSame = false;
            }
        } else {
            areArraysSame = false;
        }
        return areArraysSame;
    }
}
