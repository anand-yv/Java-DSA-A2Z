package Step04_BinarySearch.Prep02_BSonAns;

import java.util.PriorityQueue;

public class P12_GasStations {
    public static double findSmallestMaxDist(int[] stations, int k) {
        int n = stations.length;
        double low = 0, high = 0;
        for(int i = 0; i < n-1; i++){
            high = Math.max(high, stations[i+1] - stations[i]);
        }

        while((high - low) > 10e6){
            double mid = low + (high - low)/2;
            int count = countGasStations(stations, mid);
            if(count > k){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        return high;
    }

    private static int countGasStations(int[] stations, double dist) {
        int cntGas = 0;
        for(int i = 0; i < stations.length - 1; i++){
            int gasBetween = (int) ((stations[i+1] - stations[i])/dist);
            if(((stations[i+1] - stations[i])/dist) == gasBetween * dist){
                gasBetween--;
            }
            cntGas += gasBetween;
        }
        return cntGas;
    }


    static class Pair{
        double first;
        int second;

        Pair(double first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static double findSmallestMaxDistBetter(int[] stations, int k) {
        int n = stations.length;
        int[] howMany = new int[n-1];
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((a, b) -> Double.compare(a.first, b.first));

        for (int i = 0; i < n-1; i++){
            pQueue.add(new Pair(stations[i + 1] - stations[i], i));
        }

        for(int i = 0; i < k; i++){
            Pair pair = pQueue.poll();
            int ind = pair.second;
            howMany[ind]++;

            double diff = (double)(stations[ind+1] - stations[ind])/(double)(howMany[ind] + 1);
            pQueue.add(new Pair(diff, ind));
        }


        return pQueue.peek().first;
    }

    public static double findSmallestMaxDistBrute(int[] stations, int k) {
        // code here
        int n = stations.length;
        int[] howMany = new int[n-1];
        while(k != 0){
            double maxEle = -1;
            int maxEleInd = -1;
            for(int i = 0; i < n - 1; i++){
                double diff = (double)(stations[i + 1] - stations[i])/(double)(howMany[i] + 1);
                if(diff > maxEle){
                    maxEle = diff;
                    maxEleInd = i;
                }
            }
            howMany[maxEleInd]++;
            k--;
        }

        double maxAns = -1;
        for(int i = 0; i < n - 1; i++){
            double diff = (double)(stations[i + 1] - stations[i])/(double)(howMany[i] + 1);
            maxAns = Math.max(maxAns, diff);
        }
        return maxAns;
    }
}
