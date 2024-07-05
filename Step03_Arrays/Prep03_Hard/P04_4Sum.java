package Step03_Arrays.Prep03_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P04_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < nums.length; j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1, l = nums.length-1;
                while(k < l){
                    long sum =(long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum <  target) k++;
                    else if(sum > target) l--;
                    else if(sum == target){
                        res.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k - 1]) k++;
                        while(l > k && nums[l] == nums[l + 1]) l--;
                    }
                }
            }
        }
        return res;
    }
}


/*
18. 4Sum
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]


Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 */