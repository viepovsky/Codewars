package rock_paper_scissors;

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("scissors")) {
            return p2.equals("paper") ? "Player 1 won!" : "Player 2 won!";
        }
        if (p1.equals("paper")) {
            return p2.equals("rock") ? "Player 1 won!" : "Player 2 won!";
        }
        return p2.equals("scissors") ? "Player 1 won!" : "Player 2 won!";
    }
}
