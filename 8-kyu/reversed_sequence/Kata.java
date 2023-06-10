package reversed_sequence;

class Kata {
    static int[] reverse(int n){
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = n--;
        }
        return result;
    }
}
