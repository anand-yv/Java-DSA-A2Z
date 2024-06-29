package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P03_1toN {
    public static void main(String[] args) {
        printNumber(5);
    }

    private static void printNumber(int n){
        if(n != 1) printNumber(n-1);
        System.out.println(n);
    }
}
