package Company.amazon.DynamicProgramming;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int curVal = nums[0];
        int maxVal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            curVal = Math.max(curVal + cur, cur);
            maxVal = Math.max(maxVal, curVal);
        }

        return maxVal;

    }
}
