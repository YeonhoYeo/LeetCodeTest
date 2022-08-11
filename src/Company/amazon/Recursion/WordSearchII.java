package Company.amazon.Recursion;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    public static void main(String[] args) {
        char[][] board = {{'o','a','a','n'}
                        ,{'e','t','a','e'}
                        ,{'i','h','k','r'}
                        ,{'i','f','l','v'}};
        String[] words  = {"oath", "pea", "eat", "rain"};
        System.out.println(findWords(board, words));
    }

    static char[][] baseBoard;
    static int rowSize;
    static int colSize;
    static int[] dRow = {-1, 1, 0, 0};
    static int[] dCol = {0, 0, -1, 1};
    public static List<String> findWords(char[][] board, String[] words) {
        ArrayList<String> rtnVal = new ArrayList<>();
        baseBoard = board;
        rowSize = board.length;
        colSize = board[0].length;
        for (String searchWord : words) {
            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < colSize; col++) {
                    if (backTracking(row, col, searchWord, 0)) {
                        rtnVal.add(searchWord);
                        break;
                    }
                }
                if (rtnVal.contains(searchWord)) break;
            }
        }
        return rtnVal;
    }

    public static boolean backTracking(int row, int col, String word, int index){
        if (word.length() <= index) return true;
        if (word.length() == 1 && baseBoard[row][col] == word.charAt(index)) return true;
        if (baseBoard[row][col] != word.charAt(index)) return false;
        baseBoard[row][col] = '#';
        boolean let = false;
        for (int i = 0; i < dRow.length; i++) {
            int nRow = row + dRow[i];
            int nCol = col + dCol[i];
            if ( nRow >= 0 && nCol >= 0 && nRow < rowSize && nCol < colSize ) {
                let = backTracking(nRow, nCol, word, index + 1);
                if (let) break;
            }
        }
        baseBoard[row][col] = word.charAt(index);
        return let;
    }

}
