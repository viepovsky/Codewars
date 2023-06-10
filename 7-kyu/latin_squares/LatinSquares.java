package latin_squares;

class LatinSquares {
    static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];
        int starterPoint = 1;
        for (int i = 0; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare.length; j++) {
                if(starterPoint > n) {
                    starterPoint = 1;
                }
                latinSquare[i][j] = starterPoint++;
            }
            starterPoint = i + 2;
        }
        for (int[] ints : latinSquare) {
            for (int j = 0; j < latinSquare.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
        return latinSquare;
    }
}
