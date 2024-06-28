package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

import java.util.Arrays;

public class P05_ArraysStrings {
    public static void main(String[] args) {
        // Arrays
        // 1. Declare and initialize an array of integers
        int[] intArray = {10, 20, 30, 40, 50};

        // 2. Access and print array elements
        System.out.println("\nArray elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        System.out.println("Original array: " + Arrays.toString(intArray));
        // 3. Modify an array element
        intArray[2] = 35;
        System.out.println("Modified array: " + Arrays.toString(intArray));

        // 4. Multi-dimensional array
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nMulti-dimensional array:");
        for (int[] ints : multiArray) {
            System.out.println(Arrays.toString(ints));
        }

        // Strings
        // 1. Declare and initialize a string
        String str = "ANAND";

        // 2. Access and print string characters
        System.out.println("\nString Characters: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }


        // 3. String concatenation
        String greeting = "Hello";
        String name = "Alice";
        String message = greeting + ", " + name + "!";
        System.out.println("\nConcatenated string: " + message + "\n");

        // 4. String methods
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original sentence: " + sentence);
        System.out.println("Length of the sentence: " + sentence.length());
        System.out.println("Substring (10, 15): " + sentence.substring(10, 15));
        System.out.println("Index of 'fox': " + sentence.indexOf("fox"));
        System.out.println("Replace 'fox' with 'cat': " + sentence.replace("fox", "cat"));
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 5. String splitting
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
