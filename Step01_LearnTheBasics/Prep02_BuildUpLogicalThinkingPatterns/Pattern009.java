package Step01_LearnTheBasics.Prep02_BuildUpLogicalThinkingPatterns;
import java.util.Scanner;
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
public class Pattern009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        pyramid(n);
        invertPyramid(n);

        sc.close();
    }

    private static void pyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i-1) + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
