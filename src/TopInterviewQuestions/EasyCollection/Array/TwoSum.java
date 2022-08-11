package TopInterviewQuestions.EasyCollection.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for (var i = 1; i < nums.length; i++) {
            int findInt = target - nums[i];
            if (map.containsKey(findInt)) {
                return new int[] {map.get(findInt), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
