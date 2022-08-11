package Company.amazon.SortingandSearching;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals));
    }

    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<Integer> meeting = new PriorityQueue<>((o1, o2) -> Integer.compare(o1, o2));
        for ( int[] interval : intervals ) {
            if (meeting.isEmpty()) {
                meeting.offer(interval[1]);
            } else {
                if (interval[0] >= meeting.peek()) {
                    meeting.poll();
                }
                meeting.offer(interval[1]);
            }
        }

        return meeting.size();
    }
}
