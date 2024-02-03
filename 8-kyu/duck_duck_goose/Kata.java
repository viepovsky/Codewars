package duck_duck_goose;

class Kata {
    static String duckDuckGoose(Player[] players, int goose) {
        goose %= players.length;
        return goose == 0 ? players[players.length - 1].name : players[goose - 1].name;
    }
}
