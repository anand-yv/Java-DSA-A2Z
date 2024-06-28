package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

public class P06_ForLoop {
    public static void main(String[] args) {
        // Example 1: Basic for loop with array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("\nExample 1: Basic for loop with array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println();

        // Example 2: Enhanced for loop (for-each loop) with array
        System.out.println("Example 2: Enhanced for loop with array");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println();
    }
}
