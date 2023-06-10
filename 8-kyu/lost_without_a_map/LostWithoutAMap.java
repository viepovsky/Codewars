package lost_without_a_map;



class LostWithoutAMap {
    static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}
