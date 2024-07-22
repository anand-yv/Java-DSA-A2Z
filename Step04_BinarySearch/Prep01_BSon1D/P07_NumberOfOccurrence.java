package Step04_BinarySearch.Prep01_BSon1D;

public class P07_NumberOfOccurrence {
    int count(int[] nums, int n, int target) {
        // code here
        int start = firstNumber(nums, target);
        if(start == -1) return 0;
        int end = lastNumber(nums, target);
        return (end - start + 1);
    }

    public static int firstNumber(int[] nums, int target){
        int ans = -1;
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int lastNumber(int[] nums, int target){
        int ans = -1;
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
