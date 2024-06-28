package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;
/*
    *****
    *****
    *****
    *****
    *****
*/
public class Pattern001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
