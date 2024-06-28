package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

import java.util.Scanner;

public class P04_SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Switch statement with integer values
        System.out.print("\nEnter a day number (1-7): ");
        int day = scanner.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day: " + dayName);

        // Example 2: Switch statement with string values
        System.out.print("Enter your favorite fruit: ");
        String fruit = scanner.next();
        String message = switch (fruit.toLowerCase()) {
            case "apple" -> "Apples are red or green.";
            case "banana" -> "Bananas are yellow.";
            case "orange" -> "Oranges are orange.";
            case "grape" -> "Grapes can be green or purple.";
            default -> "I don't know that fruit.";
        };

        System.out.println("Fruit message: " + message);

        // Example 3: Switch statement with character values
        System.out.print("Enter a grade (A-F): ");
        char grade = scanner.next().charAt(0);
        String gradeMessage = switch (grade) {
            case 'A', 'a' -> "Excellent!";
            case 'B', 'b' -> "Good job!";
            case 'C', 'c' -> "Well done!";
            case 'D', 'd' -> "You passed.";
            case 'F', 'f' -> "Better try again.";
            default -> "Invalid grade.";
        };

        System.out.println("Grade message: " + gradeMessage);

        scanner.close();
    }
}
