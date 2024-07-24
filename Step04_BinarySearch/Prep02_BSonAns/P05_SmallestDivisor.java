package Step04_BinarySearch.Prep02_BSonAns;

public class P05_SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE;
        for (int num : nums) {
            high = Math.max(high, num);
        }

        int minDivisor = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sumByDivisor(nums, mid) <= threshold) {
                minDivisor = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minDivisor;
    }

    private int sumByDivisor(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / (double) divisor);
        }
        return sum;
    }
}
