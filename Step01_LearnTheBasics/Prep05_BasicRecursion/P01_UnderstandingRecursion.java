package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P01_UnderstandingRecursion {
    public static void main(String[] args) {
        printMessage(5);
    }

    private static void printMessage(int n){
        if(n == 0) return;
        System.out.println("Hello, There.");
        printMessage(n-1);
    }
}
