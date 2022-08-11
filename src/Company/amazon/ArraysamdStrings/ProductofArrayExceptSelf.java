package Company.amazon.ArraysamdStrings;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] rtnVal = new int[nums.length];
        int multfly = 1;
        int zeroCnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (zeroCnt > 1) {
                break;
            }
            if (nums[i] == 0) {
                zeroCnt++;
            }
            multfly = multfly * (nums[i] == 0 ? 1 : nums[i]);
        }
        for (int i = 0; i < rtnVal.length; i++) {
            if (zeroCnt > 1) {
                rtnVal[i] = 0;
            } else if (zeroCnt == 1) {
                rtnVal[i] = nums[i] == 0 ? multfly : 0;
            } else {
                rtnVal[i] = nums[i] == 0 ? multfly : multfly / nums[i];
            }
        }
        return rtnVal;
    }
}
