package Step01_LearnTheBasics.Prep04_KnowBasicMaths;

/*
Armstrong Number
You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371.

Note: Return "true" if it is an Armstrong number else return "false".

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. Hence answer is "false".
Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
100 ≤ n <1000
 */

public class P05_ArmstrongNumber {
    static String armstrongNumber(int n) {
        // code here
        int temp = n;
        int comp = 0;
        while(temp != 0){
            int rem = temp%10;
            comp += (int) Math.pow(rem,3);
            temp /= 10;
        }
        return comp == n ? "true": "false";
    }
}
