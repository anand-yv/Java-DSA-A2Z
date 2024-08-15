package Step05_StringsBasicMedium.Prep02_Medium;

import java.util.Set;
import java.util.HashSet;

public class P05_CountNumberOfSubstrings {

    long calcCount(String s, int k){
        int i = 0;
        int j = 0 ;
        int n = s.length() ;
        int[] charFreq = new int[26] ;
        int dist_count = 0 ;
        long ans = 0 ;
        while(j<n){
            charFreq[s.charAt(j)-'a']++;
            if(charFreq[s.charAt(j)-'a']==1){ //Distinct Character
                dist_count++;
            }

            //Decreasing Window Size
            while(dist_count>k){
                charFreq[s.charAt(i)-'a']--;
                if(charFreq[s.charAt(i)-'a']==0){
                    dist_count--;
                }
                i++;
            }
            j++;
            ans+=(j-i+1) ;
        }
        return ans ;
    }

    long substrCount (String S, int K) {
        // your code here
        return calcCount(S,K) - calcCount(S,K-1) ;
    }


    long substrCountBrute (String s, int k) {
        // your code here
        int subStringCount = 0;
        for(int i = 0; i < s.length(); i++){
            Set<Character> character = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                character.add(s.charAt(j));
                if(character.size() == k) subStringCount++;
                else if(character.size() > k) break;
            }
        }
        return subStringCount;
    }
}
