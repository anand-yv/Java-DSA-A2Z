package Step03_Arrays.Prep02_Medium;

import java.util.Arrays;

public class P08_NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int ind = -1;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            Arrays.sort(nums);
            return;
        }

        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        reverse(nums, ind + 1, len - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
