package grader;

class Kata {
    static String grader(double score) {
        String result =
                switch ((int) Math.floor(score * 10)) {
                    case 6 -> "D";
                    case 7 -> "C";
                    case 8 -> "B";
                    case 9 -> "A";
                    default -> "U";
                };
        return result.equals("U") ? score == 1.0 ? "A" : "F" : result;
    }
}
