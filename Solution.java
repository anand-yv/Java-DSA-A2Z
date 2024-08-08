import java.util.*;

class Solution {

    String solution0(int[] numbers){
        int even = 0, odd = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i%2 == 0) even += numbers[i];
            else odd += numbers[i];
        }
        if(even == odd) return "equal";
        else if(even > odd) return "even";
        else return "odd";
    }

    int solution(int[] numbers){
        int n = numbers.length;
        int pairCount = 0;
        for(int i = 0; i < n; i++){
            int countFirst = digitCount(numbers[i]);
            for(int j = i+1; j < n; j++){
                if(numbers[i] != numbers[j] && countFirst == digitCount(numbers[j]) && differsByOneDigit(numbers[i], numbers[j])){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }

    int digitCount(int num){
        int countDigit = 0;
        while(num != 0){
            num /= 10;
            countDigit++;
        }
        return countDigit;
    }

    boolean differsByOneDigit(int num1, int num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        int diffCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
        }
        return diffCount == 1;
    }

    String[] solution(String[] members, String[][] events){
        Map<String, Integer> timesCalled = new HashMap<>();
        for(String member: members){
            timesCalled.put(member, 0);
        }

        for(int i = 0; i < events.length; i++){
           if(events)


        }

    }




}
