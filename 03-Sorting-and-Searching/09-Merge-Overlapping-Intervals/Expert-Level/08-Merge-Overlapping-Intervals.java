import java.util.*;

class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,6},{8,10},{9,12}};
        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));

        List<int[]> result = new ArrayList<>();
        int start = a[0][0], end = a[0][1];

        for (int i = 1; i < a.length; i++) {
            if (a[i][0] <= end) end = Math.max(end, a[i][1]);
            else {
                result.add(new int[]{start, end});
                start = a[i][0];
                end = a[i][1];
            }
        }
        result.add(new int[]{start, end});

        System.out.print("Merged Intervals = ");
        for (int[] x : result) System.out.print("[" + x[0] + "," + x[1] + "] ");
    }
}
