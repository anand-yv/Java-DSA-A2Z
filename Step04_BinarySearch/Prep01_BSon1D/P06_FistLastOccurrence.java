package Step04_BinarySearch.Prep01_BSon1D;

public class P06_FistLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        int start = firstNumber(nums, target);
        if(start == -1) return new int[]{-1,-1};
        int end = lastNumber(nums, target);
        return new int[]{start, end};
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
