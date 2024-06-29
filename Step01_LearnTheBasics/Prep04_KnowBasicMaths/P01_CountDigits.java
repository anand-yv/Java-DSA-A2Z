package Step01_LearnTheBasics.Prep04_KnowBasicMaths;

/*
Count Digits - GFG - https://www.geeksforgeeks.org/problems/count-digits5716/1
Difficulty: Easy
Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.


Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
Input: n = 23
Output 0
Explanation: 2 and 3, none of them divide 23 evenly.
Expected Time Complexity: O(log n)
Expected Space Complexity: O(1)


Constraints:
1<= n <=105
 */

public class P01_CountDigits {
    private static int evenlyDivides(int n){
        // code here
        int temp = n;
        int countDigits = 0;
        while(temp != 0){
            int rem = temp % 10;
            if(rem > 0 && n % rem == 0) countDigits++;
            temp /= 10;
        }
        return countDigits;
    }
}
