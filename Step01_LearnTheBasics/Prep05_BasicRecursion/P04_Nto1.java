package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P04_Nto1 {
    public static void main(String[] args) {
        printNumberReverse(5);
    }

    private static void printNumberReverse(int n){
        if(n == 0) return;
        System.out.println(n);
        printNumberReverse(n-1);
    }
}
