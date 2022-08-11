package Company.amazon.ArraysamdStrings;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set rtnVal = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            HashMap<Integer, Integer> map = new HashMap<>();
            int target = 0 - nums[i];

            for (int j = i+1; j < nums.length; j++) {
                if ( map.containsKey(target-nums[j])) {
                    List<Integer> total = new ArrayList<>();
                    total.add(nums[i]);
                    total.add(nums[j]);
                    total.add(target-nums[j]);
                    Collections.sort(total);
                    rtnVal.add(total);
                } else {
                    map.put(nums[j], j);
                }
            }
        }

        return new ArrayList<>(rtnVal);
    }
}
