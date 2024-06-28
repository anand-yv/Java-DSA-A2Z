package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;
/*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/
public class Pattern013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }


    }
}
