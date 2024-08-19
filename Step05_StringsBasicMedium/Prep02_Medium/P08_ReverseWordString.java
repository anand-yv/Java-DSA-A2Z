package Step05_StringsBasicMedium.Prep02_Medium;

public class P08_ReverseWordString {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int right = s.length()-1;
        while(right >= 0){
            while(right >= 0 && s.charAt(right) == ' ') right--;
            if(right < 0) break;
            int left = right;
            while(left >= 0 && s.charAt(left) != ' ') left--;
            String temp = s.substring(left+1, right+1);
            if(res.isEmpty()){
                res.append(temp);
            }
            else{
                res.append(" ").append(temp);
            }
            right = left;
        }
        return res.toString();
    }
}
