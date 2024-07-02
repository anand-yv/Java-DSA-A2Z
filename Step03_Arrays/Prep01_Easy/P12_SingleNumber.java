package Step03_Arrays.Prep01_Easy;

import java.util.Arrays;

public class P12_SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int num: nums){
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int result1 = singleNumber(nums1);
        System.out.println("Array: " + Arrays.toString(nums1)); // Output: Array: [2, 2, 1]
        System.out.println("Single Number: " + result1); // Output: Single Number: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        int result2 = singleNumber(nums2);
        System.out.println("Array: " + Arrays.toString(nums2)); // Output: Array: [4, 1, 2, 1, 2]
        System.out.println("Single Number: " + result2); // Output: Single Number: 4

        int[] nums3 = {1};
        int result3 = singleNumber(nums3);
        System.out.println("Array: " + Arrays.toString(nums3)); // Output: Array: [1]
        System.out.println("Single Number: " + result3); // Output: Single Number: 1

        int[] nums4 = {};
        int result4 = singleNumber(nums4);
        System.out.println("Array: " + Arrays.toString(nums4)); // Output: Array: []
        System.out.println("Single Number: " + result4); // Output: Single Number: 0

        int[] nums5 = {3, 3, 4};
        int result5 = singleNumber(nums5);
        System.out.println("Array: " + Arrays.toString(nums5)); // Output: Array: [3, 3, 4]
        System.out.println("Single Number: " + result5); // Output: Single Number: 4
    }
}
