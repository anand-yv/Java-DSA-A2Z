package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P09_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));;
    }

    private static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
