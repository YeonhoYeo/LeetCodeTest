package Company.amazon.ArraysamdStrings;

/**
 * Approach 1: Rotate Groups of Four Cells
 *
 * Complexity Analysis
 *
 * Let MM be the number of cells in the matrix.
 *
 * Time complexity : \mathcal{O}(M) as each cell is getting read once and written once.
 *
 * Space complexity : \mathcal{O}(1) because we do not use any other additional data structures.
 */

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matrix3 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix3);
        System.out.println(Arrays.deepToString(matrix3));

        /*
         1  2  3  4
         5  6  7  8
         9 10 11 12
        13 14 15 16

        13  9 5 1
        14 10 6 2
        15 11 7 3
        16 12 8 4

        1 -> 2 -> 5 -> 6
        13 -> 9 -> 14 -> 10
        16 -> 15 -> 12 -> 11
        4 -> 8-> 3-> 7


         */
    }

    public static void rotate(int[][] matrix) {
        int matSize = matrix.length;
        for (int row = 0; row < (matSize + 1) / 2; row++) {
            for (int col = 0; col < matSize / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[matSize - 1 - col][row];
                matrix[matSize - 1 - col][row] = matrix[matSize - 1 - row][matSize - 1 - col];
                matrix[matSize - 1 - row][matSize - 1 - col] = matrix[col][matSize - 1 - row];
                matrix[col][matSize - 1 - row] = temp;
            }
        }
    }
}
