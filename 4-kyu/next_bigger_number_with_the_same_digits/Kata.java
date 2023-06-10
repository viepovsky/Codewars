package next_bigger_number_with_the_same_digits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class Kata {
    static long nextBiggerNumber(long n) {
        int[] inputArray = Arrays.stream(Long.toString(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> occuredDigits = new ArrayList<>();
        int positionOfDigitSwap = -1;
        for (int i = inputArray.length - 1; i > 0; i--) {
            occuredDigits.add(inputArray[i]);
            int previousDigit = i - 1;
            if (occuredDigits.stream().anyMatch(digit -> digit > inputArray[previousDigit])) {
                int smallestDigit = 10;
                int smallestDigitPosition = -1;
                for (int j = inputArray.length - 1; j > previousDigit; j--) {
                    if (smallestDigit > inputArray[j] && inputArray[previousDigit] < inputArray[j]) {
                        smallestDigit = inputArray[j];
                        smallestDigitPosition = j;
                    }
                }
                inputArray[smallestDigitPosition] = inputArray[previousDigit];
                inputArray[previousDigit] = smallestDigit;
                positionOfDigitSwap = previousDigit;
                break;
            }
        }
        if (positionOfDigitSwap == -1) return -1;
        List<Integer> firstPart = new ArrayList<>();
        List<Integer> secondPartToSort = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (i <= positionOfDigitSwap) {
                firstPart.add(inputArray[i]);
            } else {
                secondPartToSort.add(inputArray[i]);
            }
        }
        Collections.sort(secondPartToSort);
        firstPart.addAll(secondPartToSort);
        return Long.parseLong(firstPart.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
