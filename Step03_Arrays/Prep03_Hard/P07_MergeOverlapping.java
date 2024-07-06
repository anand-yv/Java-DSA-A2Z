package Step03_Arrays.Prep03_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P07_MergeOverlapping {

    // Optimal Solution - TC - O(nlogn) - SC - O(n)
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (list.isEmpty() || interval[0] > list.get(list.size() - 1)[1]) {
                list.add(new int[]{interval[0], interval[1]});
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }


    // Brute Force TC - O(n^2) SC - O(n)
    public int[][] mergeBrute(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        /*        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
               return a[0] - b[0];
           }
       });
        */
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!list.isEmpty() && end <= list.get(list.size() - 1)[1]) continue;

            for (int j = i + 1; j < intervals.length; j++) {
                if (end >= intervals[j][0]) {
                    end = Math.max(end, intervals[j][1]);
                } else break;
            }
            list.add(new int[]{start, end});
        }
        return list.toArray(new int[list.size()][]);
    }
}
