package Step05_StringsBasicMedium.Prep02_Medium;

public class P06_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1)
            return s;
        StringBuilder maxSubString = new StringBuilder(s.charAt(0));
        for (int i = 0; i < n; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);
            if (odd.length() > maxSubString.length()) {
                maxSubString = new StringBuilder(odd);
            }
            if (even.length() > maxSubString.length()) {
                maxSubString = new StringBuilder(even);
            }
        }
        return maxSubString.toString();
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}
