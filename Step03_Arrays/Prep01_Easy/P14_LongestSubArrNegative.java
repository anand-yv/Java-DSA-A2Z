package Step03_Arrays.Prep01_Easy;

import java.util.HashMap;
import java.util.Map;

public class P14_LongestSubArrNegative {

    public static int lenOfLongSubarr(int nums[], int n, int k) {
        //Complete the function
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) maxLength = i + 1;

            int rem = sum - k;
            if (preSumMap.get(rem) != null) {
                maxLength = Math.max(maxLength, i - preSumMap.get(rem));
            }

            if (preSumMap.get(sum) == null) {
                preSumMap.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
        testCase7();
    }

    public static void testCase1() {
        int[] nums = {10, 2, -2, -20, 10};
        int k = -10;
        int expected = 4;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 1 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }

    public static void testCase2() {
        int[] nums = {1, 2, 3};
        int k = 3;
        int expected = 2;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 2 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }

    public static void testCase3() {
        int[] nums = {-1, -1, 1};
        int k = 0;
        int expected = 2;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 3 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }

    public static void testCase4() {
        int[] nums = {1, 1, 1, 1};
        int k = 2;
        int expected = 2;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 4 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }

    public static void testCase5() {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        int expected = 4;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 5 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }

    public static void testCase6() {
        int[] nums = {};
        int k = 0;
        int expected = 0;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 6 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }

    public static void testCase7() {
        int[] nums = {5};
        int k = 5;
        int expected = 1;
        int result = lenOfLongSubarr(nums, nums.length, k);
        System.out.print("Test Case 7 - Array: ");
        printArray(nums);
        System.out.println(", k: " + k + ", Expected: " + expected + ", Result: " + result);
    }
}


