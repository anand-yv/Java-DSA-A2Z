package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

public class P07_WhileLoop {
    public static void main(String[] args) {
        // Example 1: Basic while loop
        System.out.println("Example 1: Basic while loop");
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration " + i);
            i++;
        }
        System.out.println();

        // Example 2: While loop with conditional check
        System.out.println("Example 2: While loop with conditional check");
        int num = 10;
        while (num >= 1) {
            System.out.println("Countdown: " + num);
            num--;
        }
        System.out.println();

        // Example 3: Infinite while loop with break statement
        System.out.println("Example 3: Infinite while loop with break statement");
        int counter = 0;
        while (true) {
            System.out.println("Counter: " + counter);
            counter++;
            if (counter >= 5) {
                break;
            }
        }
        System.out.println();

        // Example 4: Nested while loop
        System.out.println("Example 4: Nested while loop");
        int outer = 1;
        while (outer <= 3) {
            int inner = 1;
            while (inner <= 3) {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
                inner++;
            }
            outer++;
        }
    }
}
