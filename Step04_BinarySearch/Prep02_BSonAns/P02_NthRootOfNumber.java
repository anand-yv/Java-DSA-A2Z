package Step04_BinarySearch.Prep02_BSonAns;

public class P02_NthRootOfNumber {
    public int NthRoot(int n, int m)
    {
        // code here
        int low = 0, high = m;
        while(low <= high){
            int mid = low + (high - low)/2;
            int num = (int)Math.pow(mid, n);
            if(num == m) return mid;
            else if(num <= m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // Power exponential method:
    public static long func(int b, int exp) {
        long  ans = 1;
        long base = b;
        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans = ans * base;
            } else {
                exp /= 2;
                base = base * base;
            }
        }
        return ans;
    }
}
