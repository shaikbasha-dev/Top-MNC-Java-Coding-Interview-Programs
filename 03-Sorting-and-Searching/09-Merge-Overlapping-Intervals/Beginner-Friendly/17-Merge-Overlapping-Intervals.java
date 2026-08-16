import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));

        List<int[]> merged = new ArrayList<>();

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentEnd) {
                if (intervals[i][1] > currentEnd) {
                    currentEnd = intervals[i][1];
                }
            } else {
                merged.add(new int[]{currentStart, currentEnd});
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }

        merged.add(new int[]{currentStart, currentEnd});

        System.out.print("Merged Intervals = ");
        for (int[] interval : merged) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
    }
}
