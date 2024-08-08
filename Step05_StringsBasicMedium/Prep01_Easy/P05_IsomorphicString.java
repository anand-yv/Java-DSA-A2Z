package Step05_StringsBasicMedium.Prep01_Easy;

public class P05_IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] sArr = new int[200];
        int[] tArr = new int[200];
        for(int i = 0; i < s.length(); i++){
            if(sArr[s.charAt(i)] != tArr[t.charAt(i)]) return false;
            sArr[s.charAt(i)] = i + 1;
            tArr[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
