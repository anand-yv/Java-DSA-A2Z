package Step03_Arrays.Prep03_Hard;

import java.util.HashMap;
import java.util.Map;

public class P05_LongestSubArray0Sum {
    public int maxLen(int nums[], int n) {
        // Your code here
        Map<Integer, Integer> prefSum = new HashMap<>();
        int sum = 0;
        int maxSubLen = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == 0) maxSubLen = i + 1;

            if (prefSum.containsKey(sum)) {
                maxSubLen = Math.max(maxSubLen, i - prefSum.get(sum));
            }

            if (!prefSum.containsKey(sum)) prefSum.put(sum, i);
        }
        return maxSubLen;
    }
}


/*
Largest subarray with 0 sum
Given an array having both positive and negative integers.
The task is to compute the length of the largest subarray with sum 0.

Examples:
Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
Output: 5
Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.
Input: arr[] = {2,10,4}, n = 3
Output: 0
Explanation: There is no subarray with 0 sum.

Input: arr[] = {1, 0, -4, 3, 1, 0}, n = 6
Output: 5
Explanation: The subarray is 0 -4 3 1 0.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 105
-1000 <= arr[i] <= 1000, for each valid i
 */