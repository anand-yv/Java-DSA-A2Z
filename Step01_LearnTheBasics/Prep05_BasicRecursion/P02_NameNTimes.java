package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P02_NameNTimes {
    public static void main(String[] args) {
        printName(5);
    }

    private static void printName(int n){
        if(n == 0) return;
        System.out.println("Sakai");
        printName(n-1);
    }
}
