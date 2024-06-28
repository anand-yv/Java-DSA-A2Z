package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;
/*
    1
    01
    101
    0101
    10101
*/
public class Pattern011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = i % 2 == 0 ? 0: 1;
            for (int j = 0; j <= i; j++) {
                count = 1 - count;
                System.out.print(count);
            }
            System.out.println();
        }
        sc.close();
    }
}
