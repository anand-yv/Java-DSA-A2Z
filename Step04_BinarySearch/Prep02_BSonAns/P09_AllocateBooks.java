package Step04_BinarySearch.Prep02_BSonAns;

import java.util.ArrayList;

public class P09_AllocateBooks {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m > n) return -1;
        int low = Integer.MIN_VALUE, high = 0;
        for(int num: arr){
            low = Math.max(low, num);
            high += num;
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            if(checkStudents(arr, mid, m)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high + 1;
    }

    private static boolean checkStudents(ArrayList<Integer> arr, int target, int m) {
        int cntStudent = 1;
        int sum = 0;
        for(int num: arr){
            if(sum + num <= target){
                sum += num;
            }
            else{
                cntStudent++;
                sum = num;
            }
        }
        return cntStudent > m;
    }
}
