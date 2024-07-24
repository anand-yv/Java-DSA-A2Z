class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int minDay = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = countBouquets(bloomDay, mid, k);
            if (count >= m) {
                minDay = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return minDay;
    }

    private int countBouquets(int[] bloomDay, int days, int k) {
        int bouquet = 0;
        int count = 0;
        for (int day : bloomDay) {
            if (days >= day) {
                count++;
                if (count == k) {
                    count = 0;
                    bouquet++;
                }
            } else {
                count = 0;
            }
        }
        return bouquet;
    }
}