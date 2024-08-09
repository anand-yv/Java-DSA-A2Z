package Step05_StringsBasicMedium.Prep01_Easy;

public class P07_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()){
            count[c - 'a']--;
        }
        for (int c : count){
            if (c!=0){
                return false;
            }
        }
        return true;
    }
}
