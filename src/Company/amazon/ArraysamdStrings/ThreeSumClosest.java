package Company.amazon.ArraysamdStrings;

/**
 * Approach 1: Two Pointers
 *
 * Time Complexity: \mathcal{O}(n^2)
 *  ). We have outer and inner loops, each going through nn elements.
 *
 * Sorting the array takes \mathcal{O}(n\log{n})O(nlogn), so overall complexity is \mathcal{O}(n\log{n} + n^2)
 *  ). This is asymptotically equivalent to \mathcal{O}(n^2)
 *
 * Space Complexity: from \mathcal{O}(\log{n})O(logn) to \mathcal{O}(n)O(n), depending on the implementation of the sorting algorithm.
 */

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {

        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length -1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if ( sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return target - diff;
    }
}
