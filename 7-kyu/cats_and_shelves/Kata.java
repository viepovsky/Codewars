package cats_and_shelves;

class Kata {
    static int solution(int start, int finish) {
        int result = 0;
        while(start != finish) {
            start = finish - start >= 3 ? start + 3 : start + 1;
            result++;
        }
        return result;
    }
}
