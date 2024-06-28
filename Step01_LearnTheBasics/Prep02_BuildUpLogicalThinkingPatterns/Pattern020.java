package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;

/*
     *                 *
     * *             * *
     * * *         * * *
     * * * *     * * * *
     * * * * * * * * * *
     * * * *     * * * *
     * * *         * * *
     * *             * *
     *                 *
 */

public class Pattern020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int spaces = 2 * n - 2;
        for (int i = 1; i < 2 * n; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
            System.out.println();
        }

    }
}
