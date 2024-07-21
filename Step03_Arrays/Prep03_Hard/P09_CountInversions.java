package Step03_Arrays.Prep03_Hard;

public class P09_CountInversions {


    // Optimal Solution
    // TC : O( log(n) ) - SC : O ( n )
    static long inversionCount(long[] arr, int n) {
        // Your Code Here
        return mergeSort(arr, 0, n-1);
    }

    private static long mergeSort(long[] arr, int low, int high){
        if(low >= high) return 0;
        int mid = (low + high)/2;
        long count = 0;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    private static long merge(long[] arr, int low, int mid, int high){
        long[] temp = new long[high - low + 1];
        int left = low;
        int right = mid + 1;
        long count = 0;
        int ind = 0;
        while(left <= mid && right <= high){
            if(arr[left]  <= arr[right]){
                temp[ind++] = arr[left++];
            }
            else{
                count += mid - left + 1;
                temp[ind++] = arr[right++];
            }
        }

        while(left <= mid){
            temp[ind++] = arr[left++];
        }
        while(right <= high){
            temp[ind++] = arr[right++];
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp[i - low];
        }
        return count;
    }



    // Brute Force
    // TC : O (n^2), SC : O(1)
    public static long inversionCountBrute(long[] arr, int n) {
        // Your Code Here
        int inversionCount = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]) inversionCount++;
            }
        }
        return inversionCount;
    }
}
