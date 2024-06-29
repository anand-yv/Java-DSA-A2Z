package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P05_SumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfN(5,0));
    }

    private static int sumOfN(int n, int sum){
        if(n == 1) return 1;
        sum += n + sumOfN(n-1, 0);
        return sum;
    }
}
