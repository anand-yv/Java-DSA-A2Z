package Step01_LearnTheBasics.Prep04_KnowBasicMaths;

/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class P03_CheckPalindrome {
    private boolean isPalindrome(int x) {
        if(x<0 || (x != 0 && x%10 == 0)) return false;
        int comp = 0;
        while(x > comp){
            comp = comp*10 + x%10;
            x /= 10;
        }
        return (x == comp || x == comp/10);
    }
}
