package Step03_Arrays.Prep01_Easy;

public class P10_MissingNumber {
    public static int missingNumber(int[] nums) {
        int ans = 0;
        for(int i = 1; i < nums.length+1; i++){
            ans ^= i;
        }
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int result1 = missingNumber(nums1);
        System.out.println("Missing Number: " + result1); // Output: Missing Number: 2

        int[] nums2 = {0, 1, 3};
        int result2 = missingNumber(nums2);
        System.out.println("Missing Number: " + result2); // Output: Missing Number: 2

        int[] nums3 = {0, 1, 2, 4, 5};
        int result3 = missingNumber(nums3);
        System.out.println("Missing Number: " + result3); // Output: Missing Number: 3

        int[] nums4 = {1, 2, 3, 5};
        int result4 = missingNumber(nums4);
        System.out.println("Missing Number: " + result4); // Output: Missing Number: 0

        int[] nums5 = {0};
        int result5 = missingNumber(nums5);
        System.out.println("Missing Number: " + result5); // Output: Missing Number: 1
    }
}
