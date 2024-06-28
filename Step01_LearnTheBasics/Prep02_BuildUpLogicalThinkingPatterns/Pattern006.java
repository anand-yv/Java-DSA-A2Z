package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;
/*
    12345
    1234
    123
    12
    1
 */
public class Pattern006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = n; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
