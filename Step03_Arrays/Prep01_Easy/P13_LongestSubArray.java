package Step03_Arrays.Prep01_Easy;

//Longest sub-array with given sum K(positives)

public class P13_LongestSubArray {

    public static int lenOfLongSubarr (int[] nums, int n, int k) {
        //Complete the function
        int left = 0, right = 0;
        int maxLength = 0;
        int sum = 0;
        while(right < n){
            sum += nums[right];
            while(left < right && sum > k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int n1 = nums1.length;
        int k1 = 5;
        int result1 = lenOfLongSubarr(nums1, n1, k1);
        System.out.println("Length of longest subarray: " + result1); // Output: Length of longest subarray: 5

        int[] nums2 = {1, 2, 3, 4, 5};
        int n2 = nums2.length;
        int k2 = 10;
        int result2 = lenOfLongSubarr(nums2, n2, k2);
        System.out.println("Length of longest subarray: " + result2); // Output: Length of longest subarray: 0

        int[] nums3 = {1, 1, 1, 1, 1};
        int n3 = nums3.length;
        int k3 = 2;
        int result3 = lenOfLongSubarr(nums3, n3, k3);
        System.out.println("Length of longest subarray: " + result3); // Output: Length of longest subarray: 2

        int[] nums4 = {};
        int n4 = nums4.length;
        int k4 = 5;
        int result4 = lenOfLongSubarr(nums4, n4, k4);
        System.out.println("Length of longest subarray: " + result4); // Output: Length of longest subarray: 0

        int[] nums5 = {5, 5, 5, 5, 5};
        int n5 = nums5.length;
        int k5 = 15;
        int result5 = lenOfLongSubarr(nums5, n5, k5);
        System.out.println("Length of longest subarray: " + result5); // Output: Length of longest subarray: 3
    }
}
