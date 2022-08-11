package TopInterviewQuestions.EasyCollection.Array;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        containsDuplicate(nums);
    }

    public static boolean containsDuplicate(int[] nums) {
        Map temp = new HashMap<Integer, Integer>();
        for ( var i = 0; i < nums.length; i++ ) {
            if ( temp.containsKey(nums[i])) {
                return true;
            } else {
                temp.put(nums[i], 1);
            }
        }
        return false;
    }

    public static boolean containsDuplicate3(int[] nums) {
        List<Integer> temp = Arrays.stream(nums).boxed().toList();
        for ( var i = 0; i < nums.length; i++ ) {
            if ( i < temp.lastIndexOf(nums[i]) ) return true;
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {

        for ( var i = 0; i < nums.length; i++ ) {
            for ( var j = i+1; j < nums.length; j++ ) {
                if ( nums[i] == nums[j] ) return true;
            }
        }
        return false;
    }
}
