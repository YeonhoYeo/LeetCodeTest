package TopInterviewQuestions.EasyCollection.Array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 4};
//        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pos] = nums[i];
                System.out.println(Arrays.toString(nums));
                pos++;
            }
        }
        System.out.println(pos);
        return pos;
    }
}