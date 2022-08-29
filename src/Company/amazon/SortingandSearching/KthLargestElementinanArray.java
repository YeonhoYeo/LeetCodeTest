package Company.amazon.SortingandSearching;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));

    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(((o1, o2) -> Integer.compare(o1, o2)));
        for (int num : nums) {
            priorityQueue.offer(num);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> dictMap = new HashMap();
        for (char c : ransomNote.toCharArray()){
            dictMap.put(c, dictMap.getOrDefault(c, 0) + 1);
        }



        for (char c : magazine.toCharArray()){
            if (dictMap.containsKey(c)) {
                dictMap.put(c, dictMap.get(c) - 1);
            }
        }

        return true;
    }
}
