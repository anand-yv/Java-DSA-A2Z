package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;

/*
    A
    BB
    CCC
    DDDD
    EEEEE
*/

public class Pattern016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }

    }
}
