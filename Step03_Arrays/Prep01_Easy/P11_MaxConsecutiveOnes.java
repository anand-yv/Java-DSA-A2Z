package Step03_Arrays.Prep01_Easy;

import java.util.Arrays;

public class P11_MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int num : nums){
            if(num != 1){
                max = Math.max(max, count);
                count = 0;
            }
            else count++;
        }
        max = Math.max(count, max);
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int result1 = findMaxConsecutiveOnes(nums1);
        System.out.println("Array: " + Arrays.toString(nums1)); // Output: Array: [1, 1, 0, 1, 1, 1]
        System.out.println("Max Consecutive Ones: " + result1); // Output: Max Consecutive Ones: 3

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int result2 = findMaxConsecutiveOnes(nums2);
        System.out.println("Array: " + Arrays.toString(nums2)); // Output: Array: [1, 0, 1, 1, 0, 1]
        System.out.println("Max Consecutive Ones: " + result2); // Output: Max Consecutive Ones: 2

        int[] nums3 = {0, 0, 0};
        int result3 = findMaxConsecutiveOnes(nums3);
        System.out.println("Array: " + Arrays.toString(nums3)); // Output: Array: [0, 0, 0]
        System.out.println("Max Consecutive Ones: " + result3); // Output: Max Consecutive Ones: 0

        int[] nums4 = {1, 1, 1, 1};
        int result4 = findMaxConsecutiveOnes(nums4);
        System.out.println("Array: " + Arrays.toString(nums4)); // Output: Array: [1, 1, 1, 1]
        System.out.println("Max Consecutive Ones: " + result4); // Output: Max Consecutive Ones: 4

        int[] nums5 = {};
        int result5 = findMaxConsecutiveOnes(nums5);
        System.out.println("Array: " + Arrays.toString(nums5)); // Output: Array: []
        System.out.println("Max Consecutive Ones: " + result5); // Output: Max Consecutive Ones: 0
    }

}
