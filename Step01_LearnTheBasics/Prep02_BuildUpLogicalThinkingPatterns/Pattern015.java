package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;

/*
    ABCDE
    ABCD
    ABC
    AB
    A
*/

public class Pattern015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }

    }
}
