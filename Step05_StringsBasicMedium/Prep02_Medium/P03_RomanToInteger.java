package Step05_StringsBasicMedium.Prep02_Medium;

import java.util.HashMap;
import java.util.Map;

public class P03_RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> charValue = new HashMap<>();
        charValue.put('I', 1);
        charValue.put('V', 5);
        charValue.put('X', 10);
        charValue.put('L', 50);
        charValue.put('C', 100);
        charValue.put('D', 500);
        charValue.put('M', 1000);

        int romanToInteger = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = charValue.get(currentChar);

            if (i + 1 < s.length()) {
                int nextValue = charValue.get(s.charAt(i + 1));

                if (currentValue < nextValue) {
                    romanToInteger -= currentValue;
                } else {
                    romanToInteger += currentValue;
                }
            } else {
                romanToInteger += currentValue;
            }
        }

        return romanToInteger;
    }

    public int romanToIntBrute(String s) {
        Map<Character, Integer> charValue = new HashMap<>();
        charValue.put('I', 1);
        charValue.put('V', 5);
        charValue.put('X', 10);
        charValue.put('L', 50);
        charValue.put('C', 100);
        charValue.put('D', 500);
        charValue.put('M', 1000);

        int romanToInteger = 0;
        for(Character ch: s.toCharArray()){
            romanToInteger += charValue.get(ch);
        }

        if (s.contains("IV") || s.contains("IX")) romanToInteger -= 2;
        if (s.contains("XL") || s.contains("XC")) romanToInteger -= 20;
        if (s.contains("CD") || s.contains("CM")) romanToInteger -= 200;

        return romanToInteger;
    }
}
