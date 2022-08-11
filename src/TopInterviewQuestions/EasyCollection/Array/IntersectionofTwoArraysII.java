package TopInterviewQuestions.EasyCollection.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        List<Integer> rslt = new ArrayList<>();
        if (nums1.length > nums2.length) {
            for (int i : nums1) {
                if (temp.containsKey(i)) {
                    temp.put(i, temp.get(i) + 1);
                } else {
                    temp.put(i, 1);
                }
            }

            for (int i : nums2) {
                if (temp.containsKey(i) && temp.get(i) > 0) {
                    rslt.add(i);
                    temp.put(i, temp.get(i) - 1);
                }
            }


        } else {
            for (int i : nums2) {
                if (temp.containsKey(i)) {
                    temp.put(i, temp.get(i) + 1);
                } else {
                    temp.put(i, 1);
                }
            }

            for (int i : nums1) {
                if (temp.containsKey(i) && temp.get(i) > 0) {
                    rslt.add(i);
                    temp.put(i, temp.get(i) - 1);
                }
            }
        }

        System.out.println(rslt);

        int[] tempRtn = new int[rslt.size()];
        for ( int i = 0 ; i< rslt.size(); i++) {
            tempRtn[i] = rslt.get(i);
        }

        return tempRtn;
    }

}
