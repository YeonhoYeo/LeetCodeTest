package Company.amazon.SortingandSearching;

import java.util.*;

public class MergeIntervals {


    public static void main(String[] args) {

        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] intervals2 = {{1,4}, {2,3}};
        int[][] intervals3 = {{2,3},{4,5},{6,7},{8,9},{1,10}};

        System.out.println(Arrays.deepToString(merge(intervals3)));

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, ((o1, o2) -> o1[0] - o2[0]));
        ArrayList<int[]> al = new ArrayList<>();
        for (int[] interval : intervals) {
            if (al.size() > 0 && al.get(al.size()-1)[1] - interval[0] >= 0) {
                al.get(al.size()-1)[0] = Math.min(al.get(al.size()-1)[0], interval[0]);
                al.get(al.size()-1)[1] = Math.max(al.get(al.size()-1)[1], interval[1]);
            } else {
                al.add(new int[] {interval[0], interval[1]});
            }
        }
        return al.toArray(new int[al.size()][2]);
        //return al.toArray(al);
    }

}
