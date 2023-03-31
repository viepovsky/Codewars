package grasshopper_grade_book;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {

        int score = (s1 + s2 + s3) / 3;

        if (score >= 90){
            return 'A';
        } else if (score < 90 && score >= 80){
            return 'B';
        } else if (score < 80 && score >= 70){
            return 'C';
        } else if (score < 70 && score >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
}
