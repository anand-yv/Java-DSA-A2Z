package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P06_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n){
        if(n == 1 || n == 0) return 1;
        return n * factorial(n-1);
    }
}
