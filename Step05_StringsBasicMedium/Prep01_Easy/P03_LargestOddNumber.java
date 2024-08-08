package Step05_StringsBasicMedium.Prep01_Easy;

public class P03_LargestOddNumber {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n-1; i >= 0; i--){
            String str = String.valueOf(num.charAt(i));
            if(Integer.parseInt(str) % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
