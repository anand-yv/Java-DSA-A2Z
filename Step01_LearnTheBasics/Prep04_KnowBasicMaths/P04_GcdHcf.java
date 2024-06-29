package Step01_LearnTheBasics.Prep04_KnowBasicMaths;

/*
Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD.

Example 1:

Input: a = 5 , b = 10
Output: 10 5
Explanation: LCM of 5 and 10 is 10, while thier GCD is 5.
Input: a = 14 , b = 8
Output: 56 2
Explanation: LCM of 14 and 8 is 56, while thier GCD is 2.
Expected Time Complexity: O(log(min(a, b))
Expected Auxiliary Space: O(1)

Constraints:
1 <= a, b <= 109
 */

public class P04_GcdHcf {
    static Long[] lcmAndGcd(Long a , Long b) {
        // code here
        long gcd = calculateGcdRecursion(a,b);
        long lcm = (a * b)/gcd;
        return new Long[]{lcm, gcd};
    }

    private static long calculateGcdRecursion(long a, long b) {
        if (b == 0) return a;
        return calculateGcdRecursion(b, a % b);
    }

    private static long calculateGcd(long a, long b) {
        long gcd = 1;
        for (long i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
