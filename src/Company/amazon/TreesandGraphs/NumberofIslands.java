package Company.amazon.TreesandGraphs;

public class NumberofIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }

    public static void dfs(char[][] grid, int row, int col){
        int rowSize = grid.length;
        int colSize = grid[0].length;
        if (row < 0 || col < 0 || row >= rowSize || col >= colSize || grid[row][col] == '0') return;
        grid[row][col] = '0';
        dfs(grid, row-1, col);
        dfs(grid, row+1, col);
        dfs(grid, row, col-1);
        dfs(grid, row, col+1);
    }

    public static int numIslands(char[][] grid) {
        if ( grid == null || grid.length == 0) return 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;
        int islandCnt = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (grid[i][j] == '1'){
                    islandCnt++;
                    dfs(grid, i, j);
                }
            }
        }
        return islandCnt;
    }

}
