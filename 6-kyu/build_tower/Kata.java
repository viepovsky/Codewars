package build_tower;

import java.util.Arrays;

class Kata {
    static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];

        StringBuilder tempString = new StringBuilder();

        for (int i = 0; i < nFloors; i++) {
            tempString.append("*");
            for (int j = i; j > 0; j--){
                tempString.append("**");
            }
            for (int k = i; k < nFloors - 1; k++) {
                tempString.insert(0, " ");
                tempString.insert(tempString.length(), " ");
            }
            result[i] = tempString.toString();
            tempString = new StringBuilder();
        }
        return result;
    }
}

