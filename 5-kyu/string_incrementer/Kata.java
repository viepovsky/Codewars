package string_incrementer;

import java.math.BigDecimal;

class Kata {
    static String incrementString(String str) {
        String strWithoutNumber = str.replaceAll("([0-9]*)$", "");
        String endNumbers = str.replace(strWithoutNumber, "");
        BigDecimal numberToAdd = new BigDecimal(0);
        for (int i = 0; i < endNumbers.length(); i++) {
            if (endNumbers.charAt(i) != '0') {
                numberToAdd = new BigDecimal(endNumbers.substring(i));
                endNumbers = endNumbers.substring(0,i);
                break;
            }
            if (i == endNumbers.length() - 1) {
                endNumbers = endNumbers.substring(0, endNumbers.length() - 1);
            }
        }
        if (numberToAdd.toString().length() != numberToAdd.add(BigDecimal.valueOf(1)).toString().length() && endNumbers.length() != 0) {
            endNumbers = endNumbers.substring(0, endNumbers.length() - 1);
        }
        numberToAdd = numberToAdd.add(BigDecimal.valueOf(1));
        return strWithoutNumber + endNumbers + numberToAdd;
    }
}
