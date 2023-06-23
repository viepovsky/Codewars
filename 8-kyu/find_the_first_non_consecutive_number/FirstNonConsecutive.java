package find_the_first_non_consecutive_number;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
        Integer result = null;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i] + 1 != array[i + 1]) {
                result = array[i + 1];
                break;
            }
        }
        return result;
    }
}
