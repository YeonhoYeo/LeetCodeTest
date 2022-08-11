package TopInterviewQuestions.EasyCollection.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {

//        int[][] matrix = {{1, 2, 3}
//                        , {4, 5, 6}
//                        , {7, 8, 9}};

        int[][] matrix = {{1, 2, 3, 4}
                        , {5, 6, 7, 8}
                        , {9, 10, 11, 12}
                        , {13, 14, 15, 16}};

        rotate(matrix);

        Arrays.asList(matrix).forEach(ints -> System.out.println(Arrays.toString(ints)));
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 -j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;








//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[n - 1 - j][i];
//                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
//                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
//                matrix[j][n - 1 -i] = temp;
            }
        }
    }

    public static void rotate2(int[][] matrix) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (var col = 0; col < matrix.length; col++) {
            for (var row = matrix.length - 1; row >= 0; row--) {
                temp.add(matrix[row][col]);
            }
        }

        int i = 0;
        for (var row = 0; row < matrix.length; row++) {
            for (var col = 0; col < matrix.length; col++) {
                matrix[row][col] = temp.get(i);
                i++;
            }
        }
    }
}
