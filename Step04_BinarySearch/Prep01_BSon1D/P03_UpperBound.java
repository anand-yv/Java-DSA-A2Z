package Step04_BinarySearch.Prep01_BSon1D;

public class P03_UpperBound {
    static int findCeil(long[] arr, int n, long x) {
        int low = 0, high = n - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
