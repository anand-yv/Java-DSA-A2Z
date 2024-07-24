package Step04_BinarySearch.Prep02_BSonAns;

public class P07_KthMissingPositive {

    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            int sub =  arr[mid] - (mid + 1);
            if(sub < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high+1+k;

    }


    public int brute_findKthPositive(int[] arr, int k) {
        for (int j : arr) {
            if (j <= k) k++;
            else break;
        }
        return k;
    }

}
