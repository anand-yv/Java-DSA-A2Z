package Step05_StringsBasicMedium.Prep01_Easy;

import java.util.Arrays;

public class P04_LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String start = str[0], end = str[str.length - 1];
        int i = 0;
        while(i < start.length() && i < end.length()){
            if(start.charAt(i) == end.charAt(i)){
                i++;
            }
            else break;
        }
        return start.substring(0, i);
    }
}
