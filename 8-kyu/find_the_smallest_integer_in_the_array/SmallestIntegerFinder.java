package find_the_smallest_integer_in_the_array;

public class SmallestIntegerFinder {

    //NEW APPROACH
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int value : args) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    //OLD APPROACH
    public static int findSmallestIntOld(int[] args) {

        int number = args[0];
        for (int i = 0 ; i < args.length ; i ++){
            if (number > args[i] ){
                number  = args[i];
            }
        } return number;

    }
}
