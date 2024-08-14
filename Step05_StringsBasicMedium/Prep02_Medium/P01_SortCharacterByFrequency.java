package Step05_StringsBasicMedium.Prep02_Medium;

import java.util.*;

public class P01_SortCharacterByFrequency {

    public static String frequencySort(String s) {
        int[] count = new int[128];
        for(Character ch: s.toCharArray()){
            count[ch] += 1;
        }

        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            int index = 0;
            int max = 0;
            for(int j = 0; j < 128; j++){
                if(max < count[j]){
                    max = count[j];
                    index = j;
                }
            }

            while(count[index] != 0){
                ans.append((char)index);
                count[index]--; i++;
            }
        }
        return ans.toString();
    }

    public static String frequencySortBrute(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for(char ch: s.toCharArray()){
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }

        List<Character> charactersList = new ArrayList<>(charFreq.keySet());
        charactersList.sort((ch1, ch2) -> charFreq.get(ch2) - charFreq.get(ch1));

        StringBuilder res = new StringBuilder();
        for(Character ch: charactersList){
            for(int i = 0; i < charFreq.get(ch); i++){
                res.append(ch);
            }
        }
        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));;
        System.out.println(frequencySort("cccaaa"));;
        System.out.println(frequencySort("Aabb"));;
    }
}
