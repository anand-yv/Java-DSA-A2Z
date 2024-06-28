package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

import java.util.Arrays;

public class P09_TimeComplexity {

    public static void main(String[] args) {
        constantTimeExample();
        logarithmicTimeExample();
        linearTimeExample();
        linearithmicTimeExample();
        quadraticTimeExample();
        factorialTimeExample();
        exponentialTimeExample();
    }

    // Constant Time O(1)
    private static void constantTimeExample() {
        int[] array = {1, 2, 3, 4, 5};
        int firstElement = array[0];
        System.out.println("Constant Time Example: " + firstElement);
    }

    // Logarithmic Time O(log n)
    private static void logarithmicTimeExample() {
        int n = 16;
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
        }
        System.out.println("Logarithmic Time Example: Count of divisions - " + count);
    }

    // Linear Time O(n)
    private static void linearTimeExample() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Linear Time Example: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Linearithmic Time O(n log n)
    private static void linearithmicTimeExample() {
        int[] array = {5, 2, 9, 1, 5, 6};
        Arrays.sort(array); // Uses Merge Sort, which has O(n log n) complexity
        System.out.println("Linearithmic Time Example: Sorted array - " + Arrays.toString(array));
    }

    // Quadratic Time O(n^2)
    private static void quadraticTimeExample() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Quadratic Time Example:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    // Factorial Time O(n!)
    private static void factorialTimeExample() {
        int n = 4;
        System.out.println("Factorial Time Example:");
        permute("", "1234");
    }

    private static void permute(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }

    // Exponential Time O(2^n)
    private static void exponentialTimeExample() {
        int n = 5;
        int result = fibonacci(n);
        System.out.println("Exponential Time Example: Fibonacci of " + n + " is - " + result);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
