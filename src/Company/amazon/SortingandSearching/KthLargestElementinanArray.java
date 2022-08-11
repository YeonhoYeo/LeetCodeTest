package Company.amazon.SortingandSearching;

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
}
