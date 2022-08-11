package Company.amazon.TreesandGraphs;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] image2 = {{0, 0, 0}, {0, 0, 0}};
        int sr2 = 0;
        int sc2 = 0;
        int color2 = 0;

//        int[][] rtnVal = floodFill(image, sr, sc, color);

        int[][] rtnVal = floodFill(image2, sr2, sc2, color2);
        System.out.println(Arrays.deepToString(rtnVal));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        changeColor(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public static void changeColor(int[][] image, int sr, int sc, int orgcolor, int color) {
        int rowSize = image.length;
        int colSize = image[0].length;

        if (orgcolor == color) return;

        if (sr < 0 || sr >= rowSize || sc < 0 || sc >= colSize) return;

        if (image[sr][sc] == orgcolor) {
            image[sr][sc] = color;
            changeColor(image, sr + 1, sc, orgcolor, color);
            changeColor(image, sr - 1, sc, orgcolor, color);
            changeColor(image, sr, sc + 1, orgcolor, color);
            changeColor(image, sr, sc - 1, orgcolor, color);
        }

    }
}
