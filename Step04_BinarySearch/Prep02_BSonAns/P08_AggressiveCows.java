package Step04_BinarySearch.Prep02_BSonAns;

import java.util.Arrays;

public class P08_AggressiveCows {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[n-1] - stalls[0];

        while(low <= high){
            int mid = low + (high - low)/2;
            if(cowPlace(stalls, mid, k)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean cowPlace(int[] stalls, int dist, int k) {
        int n = stalls.length;
        int cntCows = 1;
        int last = stalls[0];
        for(int i = 1; i < n; i++){
            if(stalls[i] - last >= dist){
                cntCows++;
                last = stalls[i];
            }
            if(cntCows >= k) return true;
        }
        return false;
    }
}
