package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;
/*
     *****
     ****
     ***
     **
     *
 */
public class Pattern005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = n-1; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
