package Step05_StringsBasicMedium.Prep01_Easy;

import java.util.Arrays;

public class P02_ReverseWord {

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

    public String reverseWordsBrute(String s) {
        String[] str = s.trim().split(" +");
        int n = str.length;
        StringBuilder res = new StringBuilder();
        for(int i = n-1; i >= 0; i--){
            res.append(str[i]);
            if(i != 0) res.append(" ");
        }

        return res.toString();
    }
}
