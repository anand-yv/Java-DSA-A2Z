package Step04_BinarySearch.Prep01_BSon1D;

public class P10_MinRotatedSorted {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            if(nums[low] <= nums[high]){
                ans = Math.min(nums[low], ans);
                break;
            }
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[mid]){
                ans = Math.min(nums[low], ans);
                low = mid + 1;
            }
            else{
                ans = Math.min(nums[mid], ans);
                high = mid - 1;
            }
        }
        return ans;
    }
}
