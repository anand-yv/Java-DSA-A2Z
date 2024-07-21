package Step03_Arrays.Prep03_Hard;

public class P10_ReversePairs {

    // Optimal
    // TC : O ( O(nlog(n) ) - SC : O ( O(n) )
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low >= high){
            return count;
        }
        int mid = (low + high)/2;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public static void merge(int[] nums, int low, int mid, int high){
        int[] temp = new int[high+1];
        int left = low;
        int right = mid+1;
        int i = 0;
        while(left < mid+1 && right <= high){
            if(nums[left] <= nums[right]){
                temp[i] = nums[left];
                left++;
            }
            else{
                temp[i] = nums[right];
                right++;
            }
            i++;
        }
        while(left < mid+1){
            temp[i] = nums[left];
            left++; i++;
        }

        while(right <= high){
            temp[i] = nums[right];
            right++; i++;
        }

        for(i = low; i <= high; i++){
            nums[i] = temp[i-low];
        }

    }

    public static int countPairs(int[] nums, int low, int mid, int high){
        int right = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && nums[i] > (long)2*nums[right]){
                right++;
            }
            count += right - (mid+1);
        }
        return count;
    }



    // Brute Force
    // TC : O ( n^2 ) - SC : O ( 1 )
    public static int reversePairsBrute(int[] nums) {
        int countPairs = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > 2 * nums[j]) countPairs++;
            }
        }
        return countPairs;
    }

    public static void main(String[] args) {
        System.out.println(reversePairsBrute(new int[]{1,3,2,3,1}));
    }
}
