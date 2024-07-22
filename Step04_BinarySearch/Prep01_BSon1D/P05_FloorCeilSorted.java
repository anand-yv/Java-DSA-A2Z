package Step04_BinarySearch.Prep01_BSon1D;

import java.util.Arrays;

public class P05_FloorCeilSorted {
    public static int ceilingInSortedArray(int n, int target, int[] nums) {
        // Write your code here.
        Arrays.sort(nums);
        int start = floor(nums, target);
        int end = ceil(nums, target);
        System.out.print(start + " ");
        return end;
    }

    public static int floor(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] <= target){
                ans = nums[mid];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static int ceil(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                ans = nums[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
