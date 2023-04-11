package find_the_unknown_digit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runes {
    public static int solveExpression(final String expression) {
        Pattern pattern = Pattern.compile("^-[0-9?]*|^[0-9?]*");
        Matcher matcher = pattern.matcher(expression);
        matcher.find();
        String first = matcher.group();

        String second = expression.replaceFirst("^-[0-9?]*|^[0-9?]*", "").substring(1);
        Pattern pattern2 = Pattern.compile("-[0-9?]*|[0-9?]*");
        matcher = pattern2.matcher(second);
        matcher.find();
        second = matcher.group();

        String third = expression.split("=")[1];

        String operator = expression.replaceFirst("^-[0-9?]*|^[0-9?]*", "").substring(0, 1);

        List<Integer> possibleDigits = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        if (first.charAt(0) == '-') {
            if (first.length() > 2 && first.charAt(1) == '?') {
                possibleDigits.remove(Integer.valueOf(0));
            }
        } else {
            if (first.length() > 1 && first.charAt(0) == '?') {
                possibleDigits.remove(Integer.valueOf(0));
            }
        }
        if (second.charAt(0) == '-') {
            if (second.length() > 2 && second.charAt(1) == '?') {
                possibleDigits.remove(Integer.valueOf(0));
            }
        } else {
            if (second.length() > 1 && second.charAt(0) == '?') {
                possibleDigits.remove(Integer.valueOf(0));
            }
        }
        if (third.charAt(0) == '-') {
            if (third.length() > 2 && third.charAt(1) == '?') {
                possibleDigits.remove(Integer.valueOf(0));
            }
        } else {
            if (third.length() > 1 && third.charAt(0) == '?') {
                possibleDigits.remove(Integer.valueOf(0));
            }
        }
        first.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .distinct()
                .forEach(n -> {
                    if (possibleDigits.contains(n)) {
                        possibleDigits.remove(Integer.valueOf(n));
                    }
                });
        second.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .distinct()
                .forEach(n -> {
                    if (possibleDigits.contains(n)) {
                        possibleDigits.remove(Integer.valueOf(n));
                    }
                });
        third.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .distinct()
                .forEach(n -> {
                    if (possibleDigits.contains(n)) {
                        possibleDigits.remove(Integer.valueOf(n));
                    }
                });

        for (Integer digit : possibleDigits) {
            int tempFirst = Integer.parseInt(first.replaceAll("\\?", String.valueOf(digit)));
            int tempSecond = Integer.parseInt(second.replaceAll("\\?", String.valueOf(digit)));
            int tempThird = Integer.parseInt(third.replaceAll("\\?", String.valueOf(digit)));

            if (operator.equals("+")) {
                if (tempFirst + tempSecond == tempThird) {
                    return digit;
                }
            } else if (operator.equals("-")) {
                if (tempFirst - tempSecond == tempThird) {
                    return digit;
                }
            } else {
                if (tempFirst * tempSecond == tempThird) {
                    return digit;
                }
            }
        }
        return -1;
    }
}
