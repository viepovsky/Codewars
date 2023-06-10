package find_the_smallest_integer_in_the_array;

class SmallestIntegerFinder {

    //NEW APPROACH
    static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int value : args) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    //OLD APPROACH
    static int findSmallestIntOld(int[] args) {

        int number = args[0];
        for (int i = 0 ; i < args.length ; i ++){
            if (number > args[i] ){
                number  = args[i];
            }
        } return number;

    }
}
