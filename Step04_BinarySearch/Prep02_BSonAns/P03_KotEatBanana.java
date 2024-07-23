package Step04_BinarySearch.Prep02_BSonAns;

public class P03_KotEatBanana{
    public static int maxArray(int[] piles){
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    public static int totalHours(int[] piles, int hourly){
        int total = 0;
        for (int pile : piles) {
            total += (int) Math.ceil((double) pile / (double) hourly);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxArray(piles);
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            int reqTime = totalHours(piles, mid);
            if(reqTime <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
