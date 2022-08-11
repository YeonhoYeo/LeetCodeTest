package TopInterviewQuestions.EasyCollection.Array;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {

        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));

//        char aaa = '1';
//        System.out.println("aaa = " + Integer.parseInt(String.valueOf(aaa)));

    }

    public static boolean isValidSudokuSet(char[] board) {
        HashSet<Character> checkRowVal = new HashSet();
        for (int i = 0; i < board.length; i++) {
            if ('.' != board[i]) {
                if (checkRowVal.contains(board[i])) {
                    return false;
                } else {
                    checkRowVal.add(board[i]);
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            if (!isValidSudokuSet(board[row])) return false;
        }

        for (int col = 0; col < 9; col++) {
            char[] colChar = new char[9];
            for (int row = 0; row < 9; row++) {
                colChar[row] = board[row][col];
            }
            if (!isValidSudokuSet(colChar)) return false;
        }

        for (int col = 0; col < 9; col=col+3) {
            for (int row = 0; row < 9; row=row+3) {
                char[] colChar = new char[9];
                colChar[0] = board[row][col];
                colChar[1] = board[row][col+1];
                colChar[2] = board[row][col+2];
                colChar[3] = board[row+1][col];
                colChar[4] = board[row+1][col+1];
                colChar[5] = board[row+1][col+2];
                colChar[6] = board[row+2][col];
                colChar[7] = board[row+2][col+1];
                colChar[8] = board[row+2][col+2];
                if (!isValidSudokuSet(colChar)) return false;
            }
        }

        return true;
    }
}
