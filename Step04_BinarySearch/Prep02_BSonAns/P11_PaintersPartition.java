package Step04_BinarySearch.Prep02_BSonAns;

import java.util.ArrayList;

public class P11_PaintersPartition {
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int low = Integer.MIN_VALUE, high = 0;
        for(int board: boards){
            low = Math.max(low, board);
            high += board;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canBePainted(boards, mid, k)){
                low  = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    private static boolean canBePainted(ArrayList<Integer> boards, int area, int painters) {
        int countPainter = 1;
        int sum = 0;
        for(int board: boards){
            if(sum + board <= area){
                sum += board;
            }
            else{
                countPainter++;
                sum = board;
            }
        }
        return countPainter > painters;
    }
}
