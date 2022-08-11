package TopInterviewQuestions.EasyCollection.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i=0; i< nums.length; i++) {
                int finalI = i;
                if ( 1 == Arrays.stream(nums).filter(value -> value == nums[finalI]).count()) {
                    return nums[finalI];
                }
            }
        }

        return -1;
    }

    public static int singleNumbe2(int[] nums) {

        Map<Integer, Integer> temp = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
            if (temp.containsKey(nums[i])) {
                temp.put(nums[i], temp.get(nums[i]) + 1);
            } else {
                temp.put(nums[i], 1);
            }
        }
        System.out.println(temp);

        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }

}
