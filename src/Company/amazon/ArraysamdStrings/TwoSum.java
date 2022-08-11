package Company.amazon.ArraysamdStrings;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(nums[0], 0);

        for ( int i = 1; i < nums.length; i++) {
            if ( hmap.containsKey(target - nums[i])) {
                return new int[] {hmap.get(target - nums[i]), i};
            } else {
                hmap.put(nums[i], i);
            }
        }
        return null;
    }
}
