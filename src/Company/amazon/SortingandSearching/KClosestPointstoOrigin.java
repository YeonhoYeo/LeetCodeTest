package Company.amazon.SortingandSearching;

import java.util.ArrayList;
import java.util.Arrays;

public class KClosestPointstoOrigin {

    public static void main(String[] args) {

        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int k) {

        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int[] point : points) {
            arrayList.add(new int[] { point[0], point[1], (int) Math.pow(Math.abs(point[0]),2) + (int) Math.pow(Math.abs(point[1]),2)});
        }

        arrayList.sort(((o1, o2) -> o1[2] - o2[2]));

        int[][] rtnVal = new int[k][2];
        for ( int i = 0; i < k; i++) {
            rtnVal[i][0] = arrayList.get(i)[0];
            rtnVal[i][1] = arrayList.get(i)[1];
        }

        return rtnVal;
    }
}
