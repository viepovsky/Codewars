package tic_tac_toe_checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int isSolved(int[][] board) {
        boolean stillPlay = false;
        List<List<Integer>> rowList = new ArrayList<>();
        List<List<Integer>> columnList = new ArrayList<>();
        List<Integer> diagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            List<Integer> column = new ArrayList<>();
            List<Integer> row = new ArrayList<>();
            diagonal.add(board[i][i]);
            secondDiagonal.add(board[board.length - 1 - i][i]);
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    stillPlay = true;
                }
                row.add(board[i][j]);
                column.add(board[j][i]);
            }
            rowList.add(row);
            columnList.add(column);
        }
        boolean oWon = false;
        boolean xWon = false;
        if (rowList.stream().anyMatch(m -> m.equals(Arrays.asList(2, 2, 2))) ||
                columnList.stream().anyMatch(m -> m.equals(Arrays.asList(2, 2, 2))) ||
                diagonal.equals(Arrays.asList(2, 2, 2)) ||
                secondDiagonal.equals(Arrays.asList(2, 2, 2))) {
            oWon = true;
        } else if (rowList.stream().anyMatch(m -> m.equals(Arrays.asList(1, 1, 1))) ||
                columnList.stream().anyMatch(m -> m.equals(Arrays.asList(1, 1, 1))) ||
                diagonal.equals(Arrays.asList(1, 1, 1)) ||
                secondDiagonal.equals(Arrays.asList(1, 1, 1))) {
            xWon = true;
        }
        if (xWon) return 1;
        if (oWon) return 2;
        if (stillPlay) return -1;
        return 0;
    }
}
