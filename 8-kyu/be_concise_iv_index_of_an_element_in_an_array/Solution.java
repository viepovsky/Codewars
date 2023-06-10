package be_concise_iv_index_of_an_element_in_an_array;

class Solution {
    static String kata(String[] array, String str) {
        int i = java.util.List.of(array).indexOf(str);
        return i < 0 ? "Not found" : "" + i;
    }

//    static String kata(String[] array, String str) {
//        return Arrays.asList(array).contains(str) ? "" + Arrays.asList(array).indexOf(str) : "Not found";
//    }
//    static String kata(String[] array, String str) {
//        int i = Arrays.asList(array).indexOf(str);
//        return i < 0 ? "Not found" : "" + i;
//    }
}

/*
    static String kata(String[] array, String str) {
        return IntStream.range(0, array.length)
                .filter(i -> array[i].equals(str))
                .mapToObj(String::valueOf)
                .findFirst()
                .orElse("Not found");
    }
    */

