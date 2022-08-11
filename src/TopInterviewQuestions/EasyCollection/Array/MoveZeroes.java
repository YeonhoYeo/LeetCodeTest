package TopInterviewQuestions.EasyCollection.Array;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


    public static void moveZeroes(int[] nums) {

        int endIndex = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[endIndex] = nums[i];
                if ( endIndex != i) nums[i] = 0;
                endIndex++;
            }
            System.out.println(endIndex+":"+Arrays.toString(nums));
        }
    }

    public static void moveZeroes2(int[] nums) {

        for (var i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (var j = i; j < nums.length - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
