package highest_and_lowest;

import java.util.*;

public class Kata {
    public static String highAndLow(String numbers) {
        char[] charArray = new char[numbers.length()];
        numbers.getChars(0, numbers.length(), charArray, 0);
        List<String> numberList = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ' && !number.toString().equals("")){
                numberList.add(number.toString());
                number = new StringBuilder();
            } else if (i == charArray.length - 1) {
                number.append(charArray[i]);
                numberList.add(number.toString());
            } else {
                number.append(charArray[i]);
            }
        }
        List<Integer> integers = numberList.stream().map(Integer::parseInt).sorted().toList();
        System.out.println(integers);
        return integers .get(numberList.size() - 1) + " " + integers.get(0);
    }
}
