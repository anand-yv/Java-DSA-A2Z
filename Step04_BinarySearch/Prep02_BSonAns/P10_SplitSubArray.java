package Step04_BinarySearch.Prep02_BSonAns;

public class P10_SplitSubArray {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num: nums){
            high += num;
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            if(checkSubCount(nums, mid, k)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean checkSubCount(int[] nums, int maxSum, int target){
        int sum = 0;
        int countSub = 1;
        for(int num: nums){
            if(sum + num <= maxSum){
                sum += num;
            }
            else{
                sum = num;
                countSub++;
            }
        }
        return countSub > target;
    }
}
