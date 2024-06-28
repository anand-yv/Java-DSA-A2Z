package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;

/*
    E
    ED
    EDC
    EDCB
    EDCBA
 */

public class Pattern018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++){
            for(int j = n-1; j >= n - i - 1; j--){
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
