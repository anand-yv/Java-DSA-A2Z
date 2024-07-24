package Step04_BinarySearch.Prep02_BSonAns;

public class P06_ShipPackages {

    public int shipWithinDays(int[] weights, int days) {
        int low  = Integer.MIN_VALUE, high = 0;
        for(int weight: weights){
            low = Math.max(low, weight);
            high += weight;
        }

        int minWeight = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(calculateDay(weights, mid) <= days){
                minWeight = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return minWeight ;
    }

    private int calculateDay(int[] weights, int maxWeight){
        int sum = 0;
        int countDays = 1;
        for(int weight: weights){
            if(sum + weight > maxWeight){
                countDays++;
                sum = weight;
            }
            else{
                sum += weight;
            }
        }
        return countDays;
    }
}
