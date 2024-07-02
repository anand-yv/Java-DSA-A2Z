package Step03_Arrays.Prep02_Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P10_LongestConsecutive {

    // TC - O(n log n ) SC - O(1)
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        Arrays.sort(nums);
        int longest = 1, count = 1;
        int lastSmaller = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - 1 == lastSmaller){
                count++;
                lastSmaller = nums[i];
            }
            else if(nums[i] != lastSmaller){
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    // TC - O(n) SC - O(n)
    // Using HashSet
    public int longestConsecutiveHashSet(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // Check if it's the start of a sequence
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }


}
