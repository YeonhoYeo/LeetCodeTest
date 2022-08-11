package Company.amazon.Recursion;

public class WordSearch {

    static int[] dRow = {-1, 1, 0, 0};
    static int[] dCol = {0, 0, -1, 1};

    public static void main(String[] args) {
        
        char[][] board = {{'A','B','C','E'}
                        ,{'S','F','C','S'}
                        ,{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (search(board, row, col, word, 0)) return true;
            }
        }
        return false;
    }

    public static boolean search (char[][] board, int row, int col, String word, int index) {
        if (word.length() <= index) return true;
        if (word.length() == 1 && board[row][col] == word.charAt(index)) return true;
        if (board[row][col] != word.charAt(index)) return false;
        board[row][col] = '#';
        int rowSize = board.length;
        int colSize = board[0].length;
        for (int i = 0; i < dRow.length; i++) {
            int nRow = row + dRow[i];
            int nCol = col + dCol[i];
            if ( nRow >= 0 && nCol >= 0 && nRow < rowSize && nCol < colSize ) {
                if (search(board, nRow, nCol, word, index + 1)) return true;
            }
        }
        board[row][col] = word.charAt(index);
        return false;
    }
}
