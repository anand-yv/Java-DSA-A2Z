package Step01_LearnTheBasics.Prep05_BasicRecursion;

public class P08_StringPalindrome {
    public static void main(String[] args) {
        String str = "sasas";
        System.out.println(checkPalindrome(str, 0, str.length()-1));
    }

    private static boolean checkPalindrome(String str, int low, int high){
        if(low >= high) return true;
        if(str.charAt(low) != str.charAt(high)) return false;
        return checkPalindrome(str, ++low, --high);
    }
}
