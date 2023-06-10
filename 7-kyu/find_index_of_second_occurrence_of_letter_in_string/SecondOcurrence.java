package find_index_of_second_occurrence_of_letter_in_string;

class SecondOcurrence {
    static int secondSymbol(String str, char c) {
        int times = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                times++;
                if(times == 2) return i;
            }
        }
        return -1;
    }
}
