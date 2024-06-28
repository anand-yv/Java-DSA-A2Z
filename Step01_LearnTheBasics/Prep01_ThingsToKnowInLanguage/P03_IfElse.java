package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

import java.util.Scanner;

public class P03_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Simple if-else
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // Example 2: if-else if-else
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Example 3: Nested if-else
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a driving license (true/false)? ");
        boolean hasLicense = scanner.nextBoolean();

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You are not eligible to drive without a license.");
            }
        } else {
            System.out.println("You are not eligible to drive due to age restrictions.");
        }

        // Example 4: Using boolean variable
        System.out.print("Do you think Java is fun (true/false)? ");
        boolean isJavaFun = scanner.nextBoolean();

        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }

        scanner.close();
    }
}
