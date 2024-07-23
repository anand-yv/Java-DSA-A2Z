package Step04_BinarySearch.Prep02_BSonAns;

public class P01_SqrtOfNumber {
    long floorSqrt(long x) {
        // Your code her
        long low = 0, high = x;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long check = mid * mid;
            if (check <= x) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }
}
