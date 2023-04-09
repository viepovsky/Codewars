package is_this_a_triangle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        List<Integer> array = Arrays.asList(a, b, c);
        Collections.sort(array);
        return array.get(0) + array.get(1) > array.get(2);
    }
}
